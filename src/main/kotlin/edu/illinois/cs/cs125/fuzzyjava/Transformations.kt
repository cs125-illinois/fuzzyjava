package edu.illinois.cs.cs125.fuzzyjava

/**
 * A transformation/mutation that can be performed on a unit of code.
 */
interface Transformation {
    val name: String // The type of transformation
    val arguments: MutableSet<String> // A list of arguments for the transformation (size varies based on transformation type)
    val isSemanticsPreserving: Boolean // Whether the transformation preserves semantics (i.e. the code functions the same)
}

// -- Semantics Preserving Transformations --

/**
 * Inverts conditional statements so as to preserve semantics.
 *
 * ex. if (condition) { Code Block 1 } else { Code Block 2) ->
 *     if (!condition) { Code Block 2 } else { Code Block 1)
 *
 * @param includeElif true if if-else statements with else-if clauses are also to be inverted
 */
class InvertConditional(private val includeElif : Boolean) : Transformation {
    override val name: String = "invert-conditional"
    override val arguments = mutableSetOf<String>()
    override val isSemanticsPreserving = true
    init {
        if (includeElif) {
            arguments.add("include-elif")
        }
    }
}

/**
 * Converts for-each loops to for loops
 *
 * @param convertArray true if for-each loops that iterate through arrays are to be converted
 * @param convertIterable true if for-each loops that iterate through iterables are to be converted
 */
class ConvertForEachToFor(private val convertArray : Boolean = true, private val convertIterable : Boolean = true, private val rand : Boolean) : Transformation {
    override val name: String = "for-each-to-for"
    override val arguments = mutableSetOf<String>()
    override val isSemanticsPreserving = true
    init {
        if (convertArray) {
            arguments.add("array")
        }
        if (convertIterable) {
            arguments.add("iterable")
        }
        if (rand == true) {
            arguments.add("random")
        }
        else {
            arguments.add("all")
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
    override val arguments = mutableSetOf<String>()
    override val isSemanticsPreserving = false // Change this to true if Fuzzy Java is ported to Fuzzy Kotlin
    init {
        if (rand == true) {
            arguments.add("random")
        }
        else {
            arguments.add("all")
        }
    }
}