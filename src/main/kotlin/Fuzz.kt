package edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.antlr.*
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.lang.Exception

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
        val fuzzyComparisonTargets: List<String> = listOf("==", "!=", "<", "<=", ">", ">=")
)
class Fuzzer(val configuration: FuzzConfiguration = FuzzConfiguration()) : FuzzyJavaParserBaseListener() {
    val sourceModifications: MutableSet<SourceModification> = mutableSetOf()

    override fun enterExpression(ctx: FuzzyJavaParser.ExpressionContext) {
        if (ctx.bop?.text?.trim() != FUZZY_COMPARISON) {
            return
        }
        sourceModifications.add(SourceModification(
                ctx.bop.line, ctx.bop.charPositionInLine, ctx.bop.line, ctx.bop.charPositionInLine + FUZZY_COMPARISON.length,
                FUZZY_COMPARISON, configuration.fuzzyComparisonTargets.random()
        ))
    }
}

fun Set<SourceModification>.apply(source: String): String {
    var modifiedSource = source.lines().toMutableList()

    val unappliedModifications = mutableListOf<SourceModification>().apply {
        addAll(this@apply)
    }
    unappliedModifications.sortWith(compareBy({ it.startLine }, { it.startColumn }))

    while (!unappliedModifications.isEmpty()) {
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

fun fuzzBlock(block: String): String {
    val fuzzyJavaParseTree = parseFuzzyJava("""{
$block
}""").block()

    val fuzzer = Fuzzer()
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
