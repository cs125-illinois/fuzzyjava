package edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.antlr.*
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.tree.TerminalNode
import java.lang.Exception
import java.util.*
import kotlin.collections.HashMap

//Todo: Finish documenting this class
typealias Scopes = Stack<MutableMap<String, String>> //Todo: This mapping might change (key values could be set or map of RuleContexts)

const val FUZZY_COMPARISON = "?="
//private val documenter = Documenter()

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

//Todo: Better class description
/**
 * A class that generates variants.
 */
class Fuzzer(private val configuration: FuzzConfiguration) : FuzzyJavaParserBaseListener() {
    /**Keeps track of the members defined in particular scopes.*/
    private var scopes = Scopes()
    /**Keeps track of the modifications made so they can be applied.*/
    internal val sourceModifications: MutableSet<SourceModification> = mutableSetOf() // Added internal modifier because encapsulation and can't make the member private.
    /**
     * Enter event method that is called when the parse tree walker visits an expression context.
     *
     * @param ctx - The expression context visited by the parse tree walker.
     */
    @Override
    override fun enterExpression(ctx: FuzzyJavaParser.ExpressionContext) {
        if (ctx.bop?.text?.trim() != FUZZY_COMPARISON) {
            return
        }
        sourceModifications.add(SourceModification(
                ctx.bop.line, ctx.bop.charPositionInLine, ctx.bop.line, ctx.bop.charPositionInLine + FUZZY_COMPARISON.length,
                FUZZY_COMPARISON, configuration.fuzzyComparisonTargets.random()
        ))
    }
    /*
     * I say partially maintained because only nested classes and enums would be visible inside blocks
     * so we have to figure out how to add the outermost definitions to the scope.
     */
    /**
     * Enter event method that is called when the parse tree walker visits a block context.
     * Scope is partially maintained here. See [scopes].
     *
     * @param ctx - The block context visited by the parse tree walker.
     */
    @Override
    override fun enterBlock(ctx: FuzzyJavaParser.BlockContext) {
        scopes.add(HashMap())
    }
    /**
     * Exit event method that is called when the parse tree walker visits an block context.
     * Scope is partially maintained here. See [scopes].
     *
     * @param ctx - The expression context visited by the parse tree walker.
     */
    @Override
    override fun exitBlock(ctx: FuzzyJavaParser.BlockContext) {
        scopes.pop()
    }
    /**
     * Enter event method that is called when the parse tree walker visits an variableDeclaratorId context.
     * Delegated to [fuzzIdentifier] for fuzzy identifiers.
     *
     * @param ctx - The variableDeclaratorId context visited by the parse tree walker.
     */
    @Override
    override fun enterVariableDeclaratorId(ctx: FuzzyJavaParser.VariableDeclaratorIdContext) {
        fuzzIdentifier(ctx.FUZZYIDENTIFIER())
    }
    /**
     * Exit event method that is called when the parse tree walker visits an variableDeclaratorId context.
     *
     * @param ctx - The variableDeclaratorId context visited by the parse tree walker.
     */
    @Override
    override fun exitVariableDeclaratorId(ctx: FuzzyJavaParser.VariableDeclaratorIdContext) {
        // Will only generate docs for fuzzy variables who are fields
        //Todo: Does it make sense too add nullablity check for parent? Would this event even trigger if that were the case?
        if (ctx.FUZZYIDENTIFIER() == null || (ctx.parent.parent !is FuzzyJavaParser.FieldDeclarationContext)) {
            return
        }
        /*val fuzzyVariableToken = ctx.FUZZYIDENTIFIER().symbol
        // Todo: Do listeners exit in the same order they entered? Make sure that extracted variable is correct
        val modification:SourceModification = sourceModifications.first { it.startLine == fuzzyVariableToken.line }

        documenter.addModification(modification) // Todo: Check when the modifications are applied*/
    }
    /**
     * Enter event method that is called when the parse tree walker visits an primary context.
     * Delegated to [fuzzIdentifier] for fuzzy identifiers.
     *
     * @param ctx - The primary context visited by the parse tree walker.
     */
    @Override
    override fun enterPrimary(ctx: FuzzyJavaParser.PrimaryContext) {
        fuzzIdentifier(ctx.FUZZYIDENTIFIER())
    }
    /**
     * Helper method for fuzzing identifiers.
     * @param node - A fuzzy identifier node within the parse tree.
     */
    private fun fuzzIdentifier(node:TerminalNode?) {
        if (node == null) {
            return
        }
        val fuzzyIdentifier = node.symbol // The token that represents the fuzzy identifier
        val startLine = fuzzyIdentifier.line
        val endLine = fuzzyIdentifier.line
        val startColumn = fuzzyIdentifier.charPositionInLine
        val endColumn = startColumn + fuzzyIdentifier.text.length
        // Find all of the scopes that contain this fuzzy id
        val scopesWithFuzzyId = scopes.filter { it.containsKey(fuzzyIdentifier.text) }
        // If the fuzzy id has not already been defined in scope, generate a new id, otherwise, map it to the identifier tof it's definition
        val replacement = if (scopesWithFuzzyId.isEmpty()) configuration.fuzzyIdentifierTargets!!.nextId else scopesWithFuzzyId[0][fuzzyIdentifier.text]!!

        scopes[scopes.size - 1][fuzzyIdentifier.text] = replacement
        sourceModifications.add(SourceModification(
                startLine, startColumn, endLine, endColumn, fuzzyIdentifier.text, replacement
        ))

    }
}

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
    val idCollector = IdentifierCollector()
    val fuzzer = Fuzzer(fuzzConfiguration)
    val walker = ParseTreeWalker()

    walker.walk(idCollector, fuzzyJavaParseTree) //Pass to collect non-fuzzy ids
    if (fuzzConfiguration.fuzzyIdentifierTargets == null) { // In case the user does not provide any identifier targets
        fuzzConfiguration.fuzzyIdentifierTargets = IdSupplier(idCollector.getIdentifiers())
    }
    walker.walk(fuzzer, fuzzyJavaParseTree) // Pass to fuzz source

    val sourceModifications = fuzzer.sourceModifications.map {
        assert(it.startLine > 1 && it.endLine > 1)
        it.copy(startLine = it.startLine - 1, endLine = it.endLine - 1)
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
    val idCollector = IdentifierCollector()
    val fuzzer = Fuzzer(fuzzConfiguration)
    val walker = ParseTreeWalker()

    walker.walk(idCollector, fuzzyJavaParseTree) //Pass to collect non-fuzzy ids
    if (fuzzConfiguration.fuzzyIdentifierTargets == null) { // In case the user does not provide any identifier targets
        fuzzConfiguration.fuzzyIdentifierTargets = IdSupplier(idCollector.getIdentifiers())
    }
    walker.walk(fuzzer, fuzzyJavaParseTree) // Pass to fuzz source

    val modifiedSource = fuzzer.sourceModifications.apply(unit)

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
private fun parseFuzzyJava(source: String): FuzzyJavaParser {
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
