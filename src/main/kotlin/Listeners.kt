package edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.antlr.FuzzyJavaParser
import edu.illinois.cs.cs125.fuzzyjava.antlr.FuzzyJavaParserBaseListener
import java.lang.IllegalStateException
import java.util.*
import kotlin.collections.HashMap

private typealias Scopes = Stack<MutableMap<String, String>> //Todo: This mapping might change (key values could be set or map of RuleContexts)

//Namespaces
/**Class namespace.*/
internal const val CLASS = "CLASS"
/**Enum namespace.*/
internal const val ENUM_CONSTANT = "ENUM"
/**Interface namespace.*/
internal const val INTERFACE = "INTERFACE"
/**Method namespace.*/
internal const val METHOD = "METHOD"
/**Variable namespace.*/
internal const val VARIABLE = "VARIABLE"

const val FUZZY_COMPARISON = "?="

//Todo: Better class descriptions
/**
 * A class that listens for and bookmarks fuzzy tokensas well as what they map to.
 */
class Fuzzer(private val configuration: FuzzConfiguration) : FuzzyJavaParserBaseListener() {
    //enter and exit methods are in alphabetical order
    /**Keeps track of the members defined in particular scopes.*/
    private var scopes: Scopes = Scopes()
    /**Keeps track of the modifications made so they can be applied.*/
    internal val sourceModifications: MutableList<Lazy<SourceModification>> = mutableListOf()
    // Lazy because we need to allow for non-variable identifiers that are "used" before their definitions to map to the same generated id as their definitions
    /**
     * Enter event method that is called when the parse tree walker visits a block context.
     * Scope is partially maintained here.
     *
     * @param ctx - The block context visited by the parse tree walker.
     */
    @Override
    override fun enterBlock(ctx: FuzzyJavaParser.BlockContext) {
        scopes.add(HashMap())
    }
    /**
     * Exit event method that is called when the parse tree walker visits an block context.
     * Scope is partially maintained here.
     *
     * @param ctx - The block context visited by the parse tree walker.
     */
    @Override
    override fun exitBlock(ctx: FuzzyJavaParser.BlockContext) {
        scopes.pop()
    }
    /**
     * Enter event method that is called when the parse tree walker visits a classDeclaration context.
     * Scope is partially maintained here.
     *
     * @param ctx - The classDeclaration context visited by the parse tree walker.
     */
    @Override
    override fun enterClassDeclaration(ctx: FuzzyJavaParser.ClassDeclarationContext) {
        if (ctx.identifier().FUZZYIDENTIFIER() != null) {
            val name = ctx.identifier().FUZZYIDENTIFIER().symbol.text
            scopes.peek()[name] = configuration.fuzzyIdentifierTargets!!.nextId
        }
        scopes.add(java.util.HashMap())
    }
    /**
     * Exit event method that is called when the parse tree walker visits an classDeclaration context.
     * Scope is partially maintained here.
     *
     * @param ctx - The classDeclaration context visited by the parse tree walker.
     */
    @Override
    override fun exitClassDeclaration(ctx: FuzzyJavaParser.ClassDeclarationContext) {
        scopes.pop()
    }
    /**
     * Enter event method that is called when the parse tree walker visits a compilationUnit context.
     * Scope is partially maintained here.
     *
     * @param ctx - The compilationUnit context visited by the parse tree walker.
     */
    @Override
    override fun enterCompilationUnit(ctx: FuzzyJavaParser.CompilationUnitContext) {
        scopes.add(java.util.HashMap())
    }
    /**
     * Exit event method that is called when the parse tree walker visits an compilationUnit context.
     * Scope is partially maintained here.
     *
     * @param ctx - The compilationUnit context visited by the parse tree walker.
     */
    @Override
    override fun exitCompilationUnit(ctx: FuzzyJavaParser.CompilationUnitContext) {
        scopes.pop()
    }
    /**
     * Enter event method that is called when the parse tree walker visits a enumDeclaration context.
     * Scope is partially maintained here.
     *
     * @param ctx - The enumDeclaration context visited by the parse tree walker.
     */
    @Override
    override fun enterEnumDeclaration(ctx: FuzzyJavaParser.EnumDeclarationContext) {
        if (ctx.identifier().FUZZYIDENTIFIER() != null) {
            val name = ctx.identifier().FUZZYIDENTIFIER().symbol.text
            scopes.peek()[name] = configuration.fuzzyIdentifierTargets!!.nextId
        }
    }
    /**
     * Enter event method that is called when the parse tree walker visits a enumConstant context.
     * Scope is partially maintained here.
     *
     * @param ctx - The classDeclaration context visited by the parse tree walker.
     */
    @Override
    override fun enterEnumConstant(ctx: FuzzyJavaParser.EnumConstantContext) {
        if (ctx.identifier().FUZZYIDENTIFIER() != null) {
            val name = ctx.identifier().FUZZYIDENTIFIER().symbol.text
            scopes.peek()[name] = configuration.fuzzyIdentifierTargets!!.nextId
        }
    }
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
        sourceModifications.add(lazy {SourceModification(
                ctx.bop.line, ctx.bop.charPositionInLine, ctx.bop.line, ctx.bop.charPositionInLine + FUZZY_COMPARISON.length,
                FUZZY_COMPARISON, configuration.fuzzyComparisonTargets.random()
        )})
    }
    /**
     * Enter event method that is called when the parse tree walker visits an identifier context.
     *
     * @param ctx - identifier context visited by the parse tree walker.
     */
    @Override
    override fun enterIdentifier(ctx: FuzzyJavaParser.IdentifierContext) {
        val fuzzyIdentifier = (ctx.FUZZYIDENTIFIER() ?: return).symbol // The token that represents the fuzzy identifier
        val scopesCopy: Scopes = Stack()
        scopes.forEach { scopesCopy.add(it) }
        sourceModifications.add(lazy {
            val startLine = fuzzyIdentifier.line
            val endLine = fuzzyIdentifier.line
            val startColumn = fuzzyIdentifier.charPositionInLine
            val endColumn = startColumn + fuzzyIdentifier.text.length
            val content = fuzzyIdentifier.text
            // firstOrNull allows for definitions of fuzzy variables with same fuzzy id to map to the same replacement id, while lastOrNull makes them different
            // this is because firstOrNull traverses the stack backwards
            // when you traverse the stack backwards you run into "parent" scopes first
            val map = scopesCopy.lastOrNull { it.containsKey(content) } ?: throw IllegalStateException("Fuzzy Id used but not declared.")
            val replacement = map[content]!!
            SourceModification(
                    startLine, startColumn, endLine, endColumn, content, replacement
            )
        })
        // Find all of the scopes that contain this fuzzy id
        //val scopesWithFuzzyId = scopes.filter { it.containsKey(fuzzyIdentifier) }
    }
    /**
     * Enter event method that is called when the parse tree walker visits a interfaceDeclaration context.
     * Scope is partially maintained here.
     *
     * @param ctx - The interfaceDeclaration context visited by the parse tree walker.
     */
    @Override
    override fun enterInterfaceDeclaration(ctx: FuzzyJavaParser.InterfaceDeclarationContext) {
        if (ctx.identifier().FUZZYIDENTIFIER() != null) {
            val name = ctx.identifier().FUZZYIDENTIFIER().symbol.text
            scopes.peek()[name] = configuration.fuzzyIdentifierTargets!!.nextId
        }
        scopes.add(java.util.HashMap())
    }
    /**
     * Exit event method that is called when the parse tree walker visits an interfaceDeclaration context.
     * Scope is partially maintained here.
     *
     * @param ctx - The interfaceDeclaration context visited by the parse tree walker.
     */
    @Override
    override fun exitInterfaceDeclaration(ctx: FuzzyJavaParser.InterfaceDeclarationContext?) {
        scopes.pop()
    }
    /**
     * Enter event method that is called when the parse tree walker visits a methodDeclaration context.
     * Scope is partially maintained here.
     *
     * @param ctx - methodDeclaration context visited by the parse tree walker.
     */
    @Override
    override fun enterMethodDeclaration(ctx: FuzzyJavaParser.MethodDeclarationContext) {
        if (ctx.identifier().FUZZYIDENTIFIER() != null) {
            val name = ctx.identifier().FUZZYIDENTIFIER().symbol.text
            scopes.peek()[name] = configuration.fuzzyIdentifierTargets!!.nextId
        }
        scopes.add(java.util.HashMap())
    }
    /**
     * Exit event method that is called when the parse tree walker visits an methodDeclaration context.
     * Scope is partially maintained here.
     *
     * @param ctx - The methodDeclaration context visited by the parse tree walker.
     */
    @Override
    override fun exitMethodDeclaration(ctx: FuzzyJavaParser.MethodDeclarationContext) {
        scopes.pop()
    }
    /**
     * Enter event method that is called when the parse tree walker visits a variableDeclaratorId context.
     * Scope is partially maintained here.
     *
     * @param ctx - The variableDeclaratorId context visited by the parse tree walker.
     */
    @Override
    override fun enterVariableDeclaratorId(ctx: FuzzyJavaParser.VariableDeclaratorIdContext) {
        if (ctx.identifier().FUZZYIDENTIFIER() != null) {
            val name = ctx.identifier().FUZZYIDENTIFIER().symbol.text
            scopes.peek()[name] = configuration.fuzzyIdentifierTargets!!.nextId
        }
    }
}
/**
 * A class that collects all of the user defined identifiers.
 *
 * Used by [IdSupplier].
 */
class IdentifierListener: FuzzyJavaParserBaseListener() {
    /**The collected identifiers.*/
    private val identifiers: MutableSet<Pair<String, String>> = mutableSetOf()

    /**
     * Enter event method that is called when the parse tree walker visits an identifier context.
     * Used to collect non-fuzzy variables.
     *
     * @param ctx - The identifier context visited by the parse tree walker.
     */
    @Override
    override fun enterIdentifier(ctx: FuzzyJavaParser.IdentifierContext) {
        if (ctx.IDENTIFIER() != null) {
            assert(ctx.parent != null)
            //Separates the identifiers into their respective namespaces
            when {
                ctx.parent is FuzzyJavaParser.ClassDeclarationContext ||
                        ctx.parent is FuzzyJavaParser.CreatedNameContext      ||
                        ctx.parent is FuzzyJavaParser.InnerCreatorContext -> {
                    identifiers.add(Pair(CLASS, ctx.IDENTIFIER().text))
                }
                ctx.parent is FuzzyJavaParser.EnumConstantContext -> {
                    identifiers.add(Pair(ENUM_CONSTANT, ctx.IDENTIFIER().text))
                }
                ctx.parent is FuzzyJavaParser.InterfaceDeclarationContext -> {
                    identifiers.add(Pair(INTERFACE, ctx.IDENTIFIER().text))
                }
                ctx.parent is FuzzyJavaParser.MethodDeclarationContext ||
                        ctx.parent is FuzzyJavaParser.MethodCallContext-> {
                    identifiers.add(Pair(METHOD, ctx.IDENTIFIER().text))
                }
                ctx.parent is FuzzyJavaParser.VariableDeclaratorIdContext ||
                        ctx.parent is FuzzyJavaParser.PrimaryContext -> {
                    identifiers.add(Pair(VARIABLE, ctx.IDENTIFIER().text))
                }
            }
        }
    }
    /**
     * Getter method for the user defined [identifiers].
     *
     * @return The user defined [identifiers] and their appropriate namespaces.
     */
    fun getIdentifiers(): Set<Pair<String, String>> {
        val toReturn = identifiers.toSet()
        identifiers.clear()
        return toReturn
    }
}


