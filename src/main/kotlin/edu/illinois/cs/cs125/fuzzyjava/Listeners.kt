package edu.illinois.cs.cs125.fuzzyjava.edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.antlr.FuzzyJavaParser
import edu.illinois.cs.cs125.fuzzyjava.antlr.FuzzyJavaParserBaseListener
import org.antlr.v4.runtime.tree.ParseTree
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
 * A class that listens for and bookmarks fuzzy tokens as well as what they map to.
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
        if (ctx.identifier().FUZZY_IDENTIFIER() != null) {
            val name = ctx.identifier().FUZZY_IDENTIFIER().symbol.text
            scopes.peek()[name] = configuration.fuzzyIdentifierTargets!!.nextId
        }
        // We do not push a new "scope" onto the stack because the methods within a class need to be visible to outer scopes
        // If they try to use a private fuzzed method or a fuzzed method from a private class then we delegate that error to the compiler
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
        if (ctx.identifier().FUZZY_IDENTIFIER() != null) {
            val name = ctx.identifier().FUZZY_IDENTIFIER().symbol.text
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
        if (ctx.identifier().FUZZY_IDENTIFIER() != null) {
            val name = ctx.identifier().FUZZY_IDENTIFIER().symbol.text
            scopes.peek()[name] = configuration.fuzzyIdentifierTargets!!.nextId
        }
    }
    /**
     * Enter event method that is called when the parse tree walker visits a fuzzyComparison context.
     *
     * @param ctx - The fuzzyComparison context visited by the parse tree walker.
     */
    @Override
    override fun enterFuzzyComparison(ctx: FuzzyJavaParser.FuzzyComparisonContext) {
        val matchLength = ctx.stop.charPositionInLine + 1
        //The start won't ever be zero because that would be an illegal match
        sourceModifications.add(lazy {
            SourceModification(
                    ctx.IDENTIFIER().text, ctx.start.line, ctx.start.charPositionInLine,
                    ctx.start.line, matchLength, ctx.text, configuration.fuzzyComparisonTargets.random()
            )
        })
    }
    /**
     * Enter event method that is called when the parse tree walker visits a fuzzyLiteral context.
     *
     * @param ctx - The fuzzyLiteral context visited by the parse tree walker.
     */
    override fun enterFuzzyLiteral(ctx: FuzzyJavaParser.FuzzyLiteralContext) {
        val matchLength = ctx.stop.charPositionInLine + ctx.IDENTIFIER().text.length
        //The start won't ever be zero because that would be an illegal match
        sourceModifications.add(lazy {
            SourceModification(
                    ctx.IDENTIFIER().text, ctx.start.line, ctx.start.charPositionInLine,
                    ctx.start.line, matchLength, ctx.text, configuration.fuzzyLiteralTargets!!.next(ctx.FUZZY_LITERAL().text.substring(1))
            )
        })
    }
    /**
     * Enter event method that is called when the parse tree walker visits an identifier context.
     *
     * @param ctx - identifier context visited by the parse tree walker.
     */
    @Override
    override fun enterIdentifier(ctx: FuzzyJavaParser.IdentifierContext) {
        val fuzzyIdentifier = (ctx.FUZZY_IDENTIFIER() ?: return).symbol // The token that represents the fuzzy identifier
        val scopesCopy: Scopes = Stack()
        scopes.forEach { scopesCopy.add(it) }
        sourceModifications.add(lazy {
            val identifier = ctx.FUZZY_IDENTIFIER().text
            val startLine = fuzzyIdentifier.line
            val endLine = fuzzyIdentifier.line
            val startColumn = fuzzyIdentifier.charPositionInLine
            val endColumn = startColumn + fuzzyIdentifier.text.length
            val content = fuzzyIdentifier.text
            //Using firstOrNull traverses the stack bottom up so shadowed fuzzy identifiers map to the same generated id
            val map = scopesCopy.firstOrNull { it.containsKey(content) } ?: throw IllegalStateException("Fuzzy Id used but not declared.")
            val replacement = map[content]!!
            SourceModification(
                    identifier, startLine, startColumn, endLine, endColumn, content, replacement
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
        if (ctx.identifier().FUZZY_IDENTIFIER() != null) {
            val name = ctx.identifier().FUZZY_IDENTIFIER().symbol.text
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
        if (ctx.identifier().FUZZY_IDENTIFIER() != null) {
            val name = ctx.identifier().FUZZY_IDENTIFIER().symbol.text
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
        if (ctx.identifier().FUZZY_IDENTIFIER() != null) {
            val name = ctx.identifier().FUZZY_IDENTIFIER().symbol.text
            scopes.peek()[name] = configuration.fuzzyIdentifierTargets!!.nextId
        }
    }

    /**
     * Enter a semicolon
     * @param ctx the parse tree
     */
    @Override
    override fun enterSemicolon(ctx: FuzzyJavaParser.SemicolonContext) {
        val removeSemicolonsTransformation = configuration.fuzzyTransformations?.find { it.name == "remove-semicolons" }
        if (removeSemicolonsTransformation != null) {
            // Check that semicolon transformation is requested by the user
            val matchLength = ctx.stop.charPositionInLine + 1
            if (removeSemicolonsTransformation.arguments.contains("all") || Math.random() > 0.5) {
                // If all semicolons are to be removed OR if semicolons are removed randomly and
                // random chance lands on true, remove semicolon
                sourceModifications.add(lazy {
                    SourceModification(
                            ctx.text, ctx.start.line, ctx.start.charPositionInLine,
                            ctx.start.line, matchLength, ";", " ")
                })
            }
        }
    }

    /**
     * {@inheritDoc}
     *
     *
     * The default implementation does nothing.
     */
    override fun enterForStatement(ctx: FuzzyJavaParser.ForStatementContext) { /*
        var isEnhancedForControl : Boolean = ctx.forControl().enhancedForControl() != null;
        if (isEnhancedForControl) {
            // If this is a for-each loop
            val convertForEachToForTransformation = configuration.fuzzyTransformations?.find { it.name == "for-each-to-for" }
            if (convertForEachToForTransformation != null) {
                // If for each to for transformation is requested by the user
                val matchLength = ctx.stop.charPositionInLine + 1
                if (convertForEachToForTransformation.arguments.contains("all") || Math.random() > 0.5) {
                    // If all for-each are to be converted OR if for-each are removed randomly and
                    // random chance lands on true
                    var elementType = ctx.forControl().enhancedForControl().getChild(0).text // Type (ex. Integer)
                    var elementName = ctx.forControl().enhancedForControl().getChild(1).text // Var Name (ex. i)
                    var collectionName = ctx.forControl().enhancedForControl().getChild(1).text // Array or Iterable

                    var newForControl : String = ""; // Unenhanced For Control (ex. "i = 0; i < array.length; i++")
                    var newElementRetrievalStatement : String = ""; // First Statement (ex. "String e = array[i];")

                    if (convertForEachToForTransformation.arguments.contains("array")) {
                        // If array for-each loops are to be converted AND the for-each loop
                        // is an array for-each loop

                    }
                    else if (convertForEachToForTransformation.arguments.contains("iterable")) {
                        // If array for-each loops are to be converted AND the for-each loop
                        // is an array for-each loop
                        sourceModifications.add(lazy {
                            SourceModification(
                                    ctx.text, ctx.start.line, ctx.start.charPositionInLine,
                                    ctx.start.line, matchLength, ctx.text, " ")
                        })
                    }
                    else {
                        return; // Ensures that source modification is NOT added
                                // if this loop is not to be converted
                    }

                    var contents = ctx.getChild(4).text // Contents of loop
                    if (!(contents[0] == '{' && contents[contents.length - 1] == '}')) {
                        // If NOT a block statement (one-liner)
                        contents = "{\n" + contents.prependIndent("    ") + "\n}"// Make it a block statement, adding tabs to each line to make it look nice
                    }
                    contents = ""


                    sourceModifications.add(lazy {
                        SourceModification(
                                ctx.text, ctx.start.line, ctx.start.charPositionInLine,
                                ctx.start.line, matchLength, ctx.forControl().enhancedForControl().text, newForControl)
                    })

                    sourceModifications.add(lazy {
                        SourceModification(
                                ctx.text, ctx.start.line, ctx.start.charPositionInLine,
                                ctx.start.line, matchLength, ctx.forControl().enhancedForControl().text, newForControl)
                    })

                }
            }
        }
        else {
            // If this a normal for (not for-each) loop

            val convertForToWhileTransformation = configuration.fuzzyTransformations?.find { it.name == "for-to-while" }
            if (convertForToWhileTransformation != null) {
                // If for each to for transformation is requested by the user
            }
        }
        */
    }

    /**
     * Enter a for-each loop (converting it if convert-for-each-to-for is enabled for the specified type of for-each loop)
     */
    override fun enterEnhancedForControl(ctx: FuzzyJavaParser.EnhancedForControlContext) { /**
        val convertForEachToForTransformation = configuration.fuzzyTransformations?.find { it.name == "for-each-to-for" }
        if (convertForEachToForTransformation != null) {
            // If this is a for-each loop AND for each to for transformation is
            // requested by the user
            val matchLength = ctx.stop.charPositionInLine + 1
            if (convertForEachToForTransformation.arguments.contains("all") || Math.random() > 0.5) {
                // If all for-each are to be converted OR if for-each are removed randomly and
                // random chance lands on true
                var elementType = ctx.getChild(0).text // ex. Integer
                var elementName = ctx.getChild(1).text // ex. i
                var collectionName = ctx.getChild(1).text // Array or Iterable

                if (convertForEachToForTransformation.arguments.contains("array")) {
                    // If array for-each loops are to be converted AND the for-each loop
                    // is an array for-each loop
                    sourceModifications.add(lazy {
                        SourceModification(
                                ctx.text, ctx.start.line, ctx.start.charPositionInLine,
                                ctx.start.line, matchLength, ctx.text, "int i = 0; i < array.length; i++")
                    })
                }
                else if (convertForEachToForTransformation.arguments.contains("iterable")) {
                    // If array for-each loops are to be converted AND the for-each loop
                    // is an array for-each loop
                    sourceModifications.add(lazy {
                        SourceModification(
                                ctx.text, ctx.start.line, ctx.start.charPositionInLine,
                                ctx.start.line, matchLength, ctx.text, " ")
                    })
                }
            }
        }
        */
    }

    /**
     * Enter an expression
     */
	override fun enterExpression(ctx: FuzzyJavaParser.ExpressionContext) {
        if (ctx.getChild(0).text == "!") {
            // If this is an expression with a logical not operator
            val expCtx = ctx.getChild(1) // The expression to be negated
            val primCtx = expCtx.getChild(0)
            if (primCtx is FuzzyJavaParser.PrimaryContext
                    && primCtx.getChild(0).text == "("
                    && primCtx.getChild(2).text == ")") {
                // If this is a parenthetical expression
                val demorganTransformation = configuration.fuzzyTransformations?.find { it.name == "demorgan" }
                if (demorganTransformation != null) {
                    // If the user has requested a DeMorgan transformation
                    if (demorganTransformation.arguments.contains("all") || Math.random() > 0.5) {
                        // If the user has requested all not expressions be expanded OR
                        // they have requested rand and Math.rand lands on 0.5 or greater
                        val expInsideParCtx  = primCtx.getChild(1) // We will distribute the negative into the expression inside the parentheses
                        val negExpInsideParCtx = negateExpression(expInsideParCtx)
                        val matchLength = ctx.stop.charPositionInLine + 1
                        sourceModifications.add(lazy {
                            SourceModification(
                                    ctx.text, ctx.start.line, ctx.start.charPositionInLine,
                                    ctx.stop.line, matchLength, ctx.text, "(" + negExpInsideParCtx.text + ")")
                        })



                        for (i in 0 until expInsideParCtx.childCount) {
                            val boolOpExpCtx = expInsideParCtx.getChild(i) // Either operator or boolean expression - individual piece of compound exp.
                            val matchLength = boolOpExpCtx
                            if (boolOpExpCtx.text == "&") { // & -> |

                            }
                            else if (boolOpExpCtx.text == "|") { // | -> &

                            }
                            else if (boolOpExpCtx.text == "&&") { // && -> ||

                            }
                            else if (boolOpExpCtx.text == "||") { // || -> &&

                            }
                            else { // If it is not a bool operator, then it is a bool exp
                                if (boolOpExpCtx.childCount == 1) { // If primary expression, prepend a !

                                }
                                else { // If not a primary expression, put it in a parenthetical

                                }
                            }
                        }
                    }
                }

            }


        }
    }

    /**
     * Distributes a negative across a boolean expression (for DeMorgan's transformation).
     *
     * NOTE: Uses recursion and is memory-intensive
     */
    private fun negateExpression(ctx: ParseTree) : String {
        if (ctx.childCount == 0) { // Booleans
            if (ctx is FuzzyJavaParser.IdentifierContext) { // Boolean Identifier
                // Note that b/c of base case for comparison operator expressions, the
                // only identifiers that will be evaluated here are boolean identifiers
                return "!" + ctx.text
            }
            else if (ctx.text == "true") { // Boolean Literal: true
                return "false"
            }
            else if (ctx.text == "false") { // Boolean Literal: false
                return "true"
            }

        }
        else if (ctx.childCount == 3) {
            if (ctx.getChild(1).text == ">") {
                return ctx.getChild(0).text + "<" + ctx.getChild(2).text
            }
            else if (ctx.getChild(1).text == "<") {
                return ctx.getChild(0).text + ">" + ctx.getChild(2).text
            }
            else if (ctx.getChild(1).text == ">=") {
                return ctx.getChild(0).text + "<=" + ctx.getChild(2).text
            }
            else if (ctx.getChild(1).text == "<=") {
                return ctx.getChild(0).text + ">=" + ctx.getChild(2).text
            }
            else if (ctx.getChild(1).text == "==") {
                return ctx.getChild(0).text + "!=" + ctx.getChild(2).text
            }
            else if (ctx.getChild(1).text == "!=") {
                return ctx.getChild(0).text + "==" + ctx.getChild(2).text
            }
            else if (ctx.getChild(1).text == "&&") {
                return negateExpression(ctx.getChild(0)) + "||" + negateExpression(ctx.getChild(2))
            }
            else if (ctx.getChild(1).text == "||") {
                return negateExpression(ctx.getChild(0)) + "&&" + negateExpression(ctx.getChild(2))
            }
            else if (ctx.getChild(1).text == "&") {
                return negateExpression(ctx.getChild(0)) + "|" + negateExpression(ctx.getChild(2))
            }
            else if (ctx.getChild(1).text == "|") {
                return negateExpression(ctx.getChild(0)) + "&" + negateExpression(ctx.getChild(2))
            }
            else if (ctx.getChild(1).text == "instanceof") {
                return "!(" + ctx.getChild(0).text + "instanceof" + ctx.getChild(2).text + ")"
            }
        }
        else {
            var negatedExpression = ""
            for (i in 0 until ctx.childCount) {
                negatedExpression += negateExpression(ctx.getChild(i))
            }
            return negatedExpression
        }
        return ctx.text
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


