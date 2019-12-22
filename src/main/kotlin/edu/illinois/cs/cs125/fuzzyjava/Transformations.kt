package edu.illinois.cs.cs125.fuzzyjava

/**
 * A transformation/mutation that can be performed on a unit of code.
 */
interface Transformation {
    val name: String // The type of transformation
    val arguments: Set<String> // A list of arguments for the transformation (size varies based on transformation type)
}

/**
 * Removes semicolons from the code.
 *
 * @param rand true if semicolons are to be randomly removed, false if they are to all be removed
 */
class RemoveSemicolons(private val rand: Boolean) : Transformation {
    override val name: String = "remove-semicolons"
    override val arguments: Set<String> = setOf<String>()
    init {
        if (rand == true) {
            arguments.plus("random")
        }
        else {
            arguments.plus("all")
        }
    }
}