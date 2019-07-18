package edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.antlr.*
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.lang.Exception
import java.util.*
import kotlin.collections.HashMap

const val FUZZY_COMPARISON = "?="

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
        val fuzzyIdentifierTargets: List<String> =
                "abcedfghijklmnopqrstuvwxyz_$".toCharArray()
                                              .map { it.toString().plus((Math.random() * 100000000).toInt()) } //Todo: Find a better way to implement this
)

class Fuzzer(val configuration: FuzzConfiguration) : FuzzyJavaParserBaseListener() {
    val sourceModifications: MutableSet<SourceModification> = mutableSetOf()
    var scopes = Stack<MutableMap<String, String>>() //Todo: This mapping might change (key values could be set or map of RuleContexts)

    override fun enterExpression(ctx: FuzzyJavaParser.ExpressionContext) {
        if (ctx.bop?.text?.trim() != FUZZY_COMPARISON) {
            return
        }
        sourceModifications.add(SourceModification(
                ctx.bop.line, ctx.bop.charPositionInLine, ctx.bop.line, ctx.bop.charPositionInLine + FUZZY_COMPARISON.length,
                FUZZY_COMPARISON, configuration.fuzzyComparisonTargets.random()
        ))
    }

    override fun enterBlock(ctx: FuzzyJavaParser.BlockContext) {
        scopes.add(HashMap())
    }

    override fun exitBlock(ctx: FuzzyJavaParser.BlockContext) {
        scopes.pop()
    }

    override fun enterVariableDeclaratorId(ctx: FuzzyJavaParser.VariableDeclaratorIdContext) {
        if (ctx.FUZZYIDENTIFIER() == null) {
            return
        }
        val fuzzyIdentifier = ctx.FUZZYIDENTIFIER().symbol // The token that represents the fuzzy identifier
        val startLine = fuzzyIdentifier.line
        val endLine = fuzzyIdentifier.line
        val startColumn = fuzzyIdentifier.charPositionInLine
        val endColumn = startColumn + fuzzyIdentifier.text.length
        var replacement = configuration.fuzzyIdentifierTargets.random()

        for (scope in scopes) {
            if (scope.containsKey(fuzzyIdentifier.text)) {
                replacement = scope[fuzzyIdentifier.text]!! //Todo: Figure out how to get around this
                break
            }
        }
        scopes[scopes.size - 1][fuzzyIdentifier.text] = replacement
        sourceModifications.add(SourceModification(
                startLine, startColumn, endLine, endColumn, fuzzyIdentifier.text, replacement
        ))
    }

    override fun enterPrimary(ctx: FuzzyJavaParser.PrimaryContext) {
        if (ctx.FUZZYIDENTIFIER() == null) {
            return
        }
        val fuzzyIdentifier = ctx.FUZZYIDENTIFIER().symbol // The token that represents the fuzzy identifier
        val startLine = fuzzyIdentifier.line
        val endLine = fuzzyIdentifier.line
        val startColumn = fuzzyIdentifier.charPositionInLine
        val endColumn = startColumn + fuzzyIdentifier.text.length
        var replacement = configuration.fuzzyIdentifierTargets.random()

        for (scope in scopes) {
            if (scope.containsKey(fuzzyIdentifier.text)) {
                replacement = scope[fuzzyIdentifier.text]!! //Todo: Figure out how to get around this
                break
            }
        }
        scopes[scopes.size - 1][fuzzyIdentifier.text] = replacement
        sourceModifications.add(SourceModification(
                startLine, startColumn, endLine, endColumn, fuzzyIdentifier.text, replacement
        ))
    }
}

fun Set<SourceModification>.apply(source: String): String {
    var modifiedSource = source.lines().toMutableList()

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

fun fuzzBlock(block: String, fuzzConfiguration: FuzzConfiguration = FuzzConfiguration()): String {
    val fuzzyJavaParseTree = parseFuzzyJava("""{
$block
}""").block()

    val fuzzer = Fuzzer(fuzzConfiguration)
    val walker = ParseTreeWalker()
    walker.walk(fuzzer, fuzzyJavaParseTree)

    val sourceModifications = fuzzer.sourceModifications.map {
        assert(it.startLine > 1 && it.endLine > 1)
        it.copy(startLine = it.startLine - 1, endLine = it.endLine - 1)
    }.toSet()
    val modifiedSource = sourceModifications.apply(block)

    parseJava("""{
$modifiedSource
}""").block()

    return modifiedSource
}

fun fuzzCompilationUnit(unit: String, fuzzConfiguration: FuzzConfiguration = FuzzConfiguration()): String {
    val fuzzyJavaParseTree = parseFuzzyJava(unit).compilationUnit()

    val fuzzer = Fuzzer(fuzzConfiguration)
    val walker = ParseTreeWalker()
    walker.walk(fuzzer, fuzzyJavaParseTree)

    val modifiedSource = fuzzer.sourceModifications.apply(unit)

    parseJava("""{
$modifiedSource
}""").block()

    return modifiedSource
}

private fun parseFuzzyJava(source: String): FuzzyJavaParser {
    val charStream = CharStreams.fromString(source)
    val fuzzyJavaLexer = FuzzyJavaLexer(charStream)
    val tokenStream = CommonTokenStream(fuzzyJavaLexer)
    return FuzzyJavaParser(tokenStream)
}

class JavaParseError(
        val line: Int, val column: Int, message: String
) : Exception(message)

private class JavaErrorListener : BaseErrorListener() {
    override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String, e: RecognitionException?) {
        throw JavaParseError(line, charPositionInLine, msg)
    }
}

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
