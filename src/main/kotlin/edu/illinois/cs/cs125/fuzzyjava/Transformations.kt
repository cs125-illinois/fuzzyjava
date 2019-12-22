package edu.illinois.cs.cs125.fuzzyjava

/**
 * A transformation/mutation that can be performed on a unit of code.
 */
interface Transformation {
    val name: String // The type of transformation
    val arguments: Set<String> // A list of arguments for the transformation (size varies based on transformation type)
    val isSemanticsPreserving: Boolean // Whether the transformation preserves semantics (i.e. the code functions the same)
}

// -- Semantics Preserving Transformations --

/**
 * Inverts if-else statements so as to preserve semantics.
 *
 * ex. if (condition) { Code Block 1 } else { Code Block 2) ->
 *     if (!condition) { Code Block 2 } else { Code Block 1)
 *
 * @param includeElif true if if-else statements with else-if clauses are also to be inverted
 */
class InvertIfElse(private val includeElif : Boolean) : Transformation {
    override val name: String = "invert-if-else"
    override val arguments = setOf<String>()
    override val isSemanticsPreserving = true
    init {
        if (includeElif) {
            arguments.plus("include-elif")
        }
    }
}

// -- Non-Semantics Preserving Transformations --

/**
 * Removes semicolons from the code, either randomly or entirely.
 *
 * @param rand true if semicolons are to be randomly removed, false if they are to all be removed
 */
class RemoveSemicolons(private val rand: Boolean) : Transformation {
    override val name: String = "remove-semicolons"
    override val arguments = setOf<String>()
    override val isSemanticsPreserving = false // TODO: Change this to true if Fuzzy Java is ported to Fuzzy Kotlin
    init {
        if (rand == true) {
            arguments.plus("random")
        }
        else {
            arguments.plus("all")
        }
    }
}