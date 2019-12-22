package edu.illinois.cs.cs125.fuzzyjava.edu.illinois.cs.cs125.fuzzyjava


import edu.illinois.cs.cs125.fuzzyjava.Transformation
import edu.illinois.cs.cs125.fuzzyjava.antlr.FuzzyJavaLexer
import edu.illinois.cs.cs125.fuzzyjava.antlr.FuzzyJavaParser
import edu.illinois.cs.cs125.fuzzyjava.antlr.JavaLexer
import edu.illinois.cs.cs125.fuzzyjava.antlr.JavaParser
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker

//Todo: Finish documenting this class
/**
 * Holds information about the modifications made while walking the parse tree.
 */
data class SourceModification(
        var identifier: String,
        var startLine: Int,
        var startColumn: Int,
        var endLine: Int,
        var endColumn: Int,
        val content: String,
        val replace: String
)
/**
 * Holds information about how the user would like to fuzz the code.
 */
data class FuzzConfiguration(
        // These should not need to be changed from the default
        val fuzzyComparisonTargets: List<String> = listOf("==", "!=", "<", "<=", ">", ">="),

        // Default is null for these because we do not know if the user will provide targets, and if not,
        // we need to collect all of the non-fuzzy variables before creating and IdSupplier instance
        var fuzzyIdentifierTargets: IdSupplier? = null,
        var fuzzyLiteralTargets: LiteralSupplier? = null,

        // This is a list of optional transformations that the user may supply - defaults to empty for no transformations
        var fuzzyTransformations: MutableList<Transformation>? = mutableListOf()
)
/**
 * Applies source modifications to the source code
 *
 * @param source the source code that will be modified.
 * @return the modified source code.
 */
fun Set<SourceModification>.apply(source: String): String {
    val modifiedSource = source.lines().toMutableList()

    val unappliedModifications = mutableListOf<SourceModification>().apply {
        addAll(this@apply)
    }
    unappliedModifications.sortWith(compareBy({ it.startLine }, { it.startColumn }))

    while (unappliedModifications.isNotEmpty()) {
        val currentModification = unappliedModifications.first()

        assert(currentModification.startLine == currentModification.endLine)

        val lineToModify = modifiedSource[currentModification.startLine - 1].toCharArray()
        val toReplace = lineToModify.slice(IntRange(currentModification.startColumn, currentModification.endColumn - 1)).joinToString(separator = "")
        assert(toReplace == currentModification.content)
        modifiedSource[currentModification.startLine - 1] =
                lineToModify.slice(IntRange(0, currentModification.startColumn - 1)).joinToString(separator = "") +
                currentModification.replace +
                lineToModify.slice(IntRange(currentModification.endColumn, lineToModify.size - 1)).joinToString(separator = "")

        val difference = currentModification.replace.length - currentModification.content.length
        unappliedModifications.filter {
            it.startLine == currentModification.startLine || it.endLine == currentModification.startLine
        }.forEach {
            if (it.startLine == currentModification.startLine) {
                it.startColumn += difference
            }
            if (it.endLine == currentModification.startLine) {
                it.endColumn += difference
            }
        }

        unappliedModifications.remove(currentModification)
    }

    return modifiedSource.joinToString(separator = "\n")
}
/**
 * Fuzzes a "block" of template code.
 *
 * @param block - The block of source code to be fuzzed.
 * @param fuzzConfiguration - The config that will be used to modify the block.
 * @return Returns a block of Java code.
 */
//passed the source code to default of fuzz config so IdSupplier can get all of the non-fuzzy identifiers
fun fuzzBlock(block: String, fuzzConfiguration: FuzzConfiguration = FuzzConfiguration()): String {
    val fuzzyJavaParseTree = parseFuzzyJava("""{
$block
}""").block()
    val fuzzer = Fuzzer(fuzzConfiguration)
    val walker = ParseTreeWalker()

    if (fuzzConfiguration.fuzzyIdentifierTargets == null) { // In case the user does not provide any identifier targets
        val idCollector = IdentifierListener()
        walker.walk(idCollector, fuzzyJavaParseTree) //Pass to collect non-fuzzy ids
        fuzzConfiguration.fuzzyIdentifierTargets = IdSupplier(idCollector.getIdentifiers())
    }
    assert(fuzzConfiguration.fuzzyIdentifierTargets != null)
    if (fuzzConfiguration.fuzzyLiteralTargets == null) {
        fuzzConfiguration.fuzzyLiteralTargets = LiteralSupplier()
    }
    assert(fuzzConfiguration.fuzzyLiteralTargets != null)
    walker.walk(fuzzer, fuzzyJavaParseTree) // Pass to fuzz source
    //sourceModifications.map { it.value }.toSet()
    val sourceModifications: Set<SourceModification> = fuzzer.sourceModifications.map { it.value }.map {
        assert(it.startLine > 1 && it.endLine > 1)
        it.copy(startLine = it.startLine - 1, endLine = it.endLine - 1)
    }.toSet()
    var modifiedSource = sourceModifications.apply(block)
    modifiedSource = document(modifiedSource, sourceModifications)

    parseJava("""{
$modifiedSource
}""").block()

    //println(getDocumentationOfProblem() + "\n\n")
    return modifiedSource
}
/**
 * Fuzzes a "unit" of template code.
 *
 * @param unit - the block of source code to be fuzzed
 * @param fuzzConfiguration - the config that will be used to modify the unit
 * @return a unit of Java code
 */
//passed the source code to default of fuzz config so IdSupplier can get all of the non-fuzzy identifiers
fun fuzzCompilationUnit(unit: String, fuzzConfiguration: FuzzConfiguration = FuzzConfiguration()): String {
    val fuzzyJavaParseTree = parseFuzzyJava(unit).compilationUnit()
    val fuzzer = Fuzzer(fuzzConfiguration)
    val walker = ParseTreeWalker()

    if (fuzzConfiguration.fuzzyIdentifierTargets == null) { // In case the user does not provide any identifier targets
        val idCollector = IdentifierListener()
        walker.walk(idCollector, fuzzyJavaParseTree) //Pass to collect non-fuzzy ids
        fuzzConfiguration.fuzzyIdentifierTargets = IdSupplier(idCollector.getIdentifiers())
    }
    assert(fuzzConfiguration.fuzzyIdentifierTargets != null)
    if (fuzzConfiguration.fuzzyLiteralTargets == null) {
        fuzzConfiguration.fuzzyLiteralTargets = LiteralSupplier()
    }
    assert(fuzzConfiguration.fuzzyLiteralTargets != null)
    walker.walk(fuzzer, fuzzyJavaParseTree) // Pass to fuzz source

    val sourceModifications = fuzzer.sourceModifications.map { it.value }.toSet()
    var modifiedSource = sourceModifications.apply(unit)
    modifiedSource = document(modifiedSource, sourceModifications)

    parseJava("""{
$modifiedSource
}""").block()

    //println(getDocumentationOfProblem() + "\n\n")
    return modifiedSource
}

/**
 * Fuzzes the compilation unit without checking for syntax errors. Useful for
 * intentionally creating code with syntax errors (i.e. "find the bug" type
 * problems).
 *
 * @param unit - the block of source code to be fuzzed
 * @param fuzzConfiguration - The config that will be used to modify the unit.
 * @return returns a string (not a unit) representing the fuzzed Java code
 */
fun fuzzCompilationUnitWithoutParse(unit: String, fuzzConfiguration: FuzzConfiguration = FuzzConfiguration()): String {
    val fuzzyJavaParseTree = parseFuzzyJava(unit).compilationUnit()
    val fuzzer = Fuzzer(fuzzConfiguration)
    val walker = ParseTreeWalker()

    if (fuzzConfiguration.fuzzyIdentifierTargets == null) { // In case the user does not provide any identifier targets
        val idCollector = IdentifierListener()
        walker.walk(idCollector, fuzzyJavaParseTree) //Pass to collect non-fuzzy ids
        fuzzConfiguration.fuzzyIdentifierTargets = IdSupplier(idCollector.getIdentifiers())
    }
    assert(fuzzConfiguration.fuzzyIdentifierTargets != null)
    if (fuzzConfiguration.fuzzyLiteralTargets == null) {
        fuzzConfiguration.fuzzyLiteralTargets = LiteralSupplier()
    }
    assert(fuzzConfiguration.fuzzyLiteralTargets != null)
    walker.walk(fuzzer, fuzzyJavaParseTree) // Pass to fuzz source

    val sourceModifications = fuzzer.sourceModifications.map { it.value }.toSet()
    var modifiedSource = sourceModifications.apply(unit)

    return modifiedSource;
}

private fun document(source : String, sourceModifications : Set<SourceModification>): String {
    val documenter = Documenter(source, sourceModifications)
    return documenter.generate()
}
//Todo: Better docs for code below
/**
 * Used to check if code adheres to the template language syntax.
 *
 * @param source - the original source inputted by the user.
 * @return a parser
 */
internal fun parseFuzzyJava(source: String): FuzzyJavaParser {
    val charStream = CharStreams.fromString(source)
    val fuzzyJavaLexer = FuzzyJavaLexer(charStream)
    val tokenStream = CommonTokenStream(fuzzyJavaLexer)
    return FuzzyJavaParser(tokenStream)
}  
/**
 * A class that holds information about what went wrong while parsing Java code.
 */
class JavaParseError(
        val line: Int, val column: Int, message: String
) : Exception(message)
/**
 * A class that creates a Java Listener.
 */
private class JavaErrorListener : BaseErrorListener() {
    /**
     * Detects Java syntax errors.
     *
     * @param recognizer -
     * @param offendingSymbol - The illegal symbol.
     * @param line - The line [offendingSymbol] was on.
     * @param charPositionInLine - The character position of [offendingSymbol] within the [line].
     * @param msg - Error message to display.
     * @param e -
     * @throws [JavaParseError]
     */
    @Override
    override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String, e: RecognitionException?) {
        throw JavaParseError(line, charPositionInLine, msg)
    }
}
/**
 * Parses Java code.
 *
 * @param source - The Java source code to be parsed.
 * @return Returns a parser.
 */
private fun parseJava(source: String): JavaParser {
    val javaErrorListener = JavaErrorListener()
    val charStream = CharStreams.fromString(source)
    val javaLexer = JavaLexer(charStream)
    javaLexer.removeErrorListeners()
    javaLexer.addErrorListener(javaErrorListener)

    val tokenStream = CommonTokenStream(javaLexer)
    return JavaParser(tokenStream).also {
        it.removeErrorListeners()
        it.addErrorListener(javaErrorListener)
    }
}
