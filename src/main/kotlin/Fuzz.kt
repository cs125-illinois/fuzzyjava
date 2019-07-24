package edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.antlr.*
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.lang.Exception

//Todo: Finish documenting this class

data class SourceModification(
        var startLine: Int,
        var startColumn: Int,
        var endLine: Int,
        var endColumn: Int,
        val content: String,
        val replace: String
)

data class FuzzConfiguration(
        val fuzzyComparisonTargets: List<String> = listOf("==", "!=", "<", "<=", ">", ">="),
        // Default is null because we do not know if the user will provide targets, and if not,
        // we need to collect all of the non-fuzzy variables before creating and IdSupplier instance
        var fuzzyIdentifierTargets: IdSupplier? = null //Todo: Possibly find a better way to implement this
)

//Todo: Better Documentation for this method.
/**
 * Method used to apply the modifications
 * @param source - The source code that will be modified.
 * @return Returns the modified source code.
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

    //documenter.inspectModifications()

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
    walker.walk(fuzzer, fuzzyJavaParseTree) // Pass to fuzz source
    //sourceModifications.map { it.value }.toSet()
    val sourceModifications = fuzzer.sourceModifications.map {
        assert(it.value.startLine > 1 && it.value.endLine > 1)
        it.value.copy(startLine = it.value.startLine - 1, endLine = it.value.endLine - 1)
    }.toSet()
    val modifiedSource = sourceModifications.apply(block)

    parseJava("""{
$modifiedSource
}""").block()

    //println(getDocumentationOfProblem() + "\n\n")
    return modifiedSource
}

/**
 * Fuzzes a "unit" of template code.
 *
 * @param unit - The block of source code to be fuzzed.
 * @param fuzzConfiguration - The config that will be used to modify the unit.
 * @return Returns a unit of Java code.
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
    walker.walk(fuzzer, fuzzyJavaParseTree) // Pass to fuzz source

    val modifiedSource = fuzzer.sourceModifications.map { it.value }.toSet().apply(unit)

    parseJava("""{
$modifiedSource
}""").block()

    //println(getDocumentationOfProblem() + "\n\n")
    return modifiedSource
}

/*fun getDocumentationOfProblem(): String {
    return "";//documenter.getInspectionResults() //Todo: uncomment this
}*/

//Todo: Better docs for code below
/**
 * Used to check if code adheres to the template language syntax.
 *
 * @param source - The original source inputted by the user.
 * @return Returns a parser.
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
