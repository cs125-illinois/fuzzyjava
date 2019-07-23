package edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.antlr.FuzzyJavaParser
import edu.illinois.cs.cs125.fuzzyjava.antlr.FuzzyJavaParserBaseListener

//Namespaces
internal const val CLASS = "CLASS"
internal const val VARIABLE = "VARIABLE"
internal const val ENUM = "ENUM"
internal const val METHOD = "METHOD"

class IdentifierCollector: FuzzyJavaParserBaseListener() {
    private val identifiers: MutableSet<Pair<String, String>> = mutableSetOf()

    /**
     * Enter event method that is called when the parse tree walker visits an variableDeclaratorId context.
     * Used to collect non-fuzzy variables.
     *
     * @param ctx - The variableDeclaratorId context visited by the parse tree walker.
     */
    @Override
    override fun enterVariableDeclaratorId(ctx: FuzzyJavaParser.VariableDeclaratorIdContext) {
        if (ctx.IDENTIFIER() != null) {
            identifiers.add(Pair(VARIABLE, ctx.IDENTIFIER().text))
        }
    }
    /**
     * Enter event method that is called when the parse tree walker visits an primary context.
     * Used to collect non-fuzzy variables.
     *
     * @param ctx - The primary context visited by the parse tree walker.
     */
    @Override
    override fun enterPrimary(ctx: FuzzyJavaParser.PrimaryContext) {
        if (ctx.IDENTIFIER() != null) {
            identifiers.add(Pair(VARIABLE,ctx.IDENTIFIER().text))
        }
    }

    fun getIdentifiers(): Set<Pair<String, String>> {
        val toReturn = identifiers.toSet() //Todo: Find a better way to deep copy
        identifiers.clear()
        return toReturn
    }
}