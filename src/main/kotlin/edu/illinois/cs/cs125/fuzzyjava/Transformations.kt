package edu.illinois.cs.cs125.fuzzyjava

/**
 * A transformation/mutation that can be performed on a unit of code.
 */
interface Transformation {
    val name: String; // The type of transformation
    val arguments: Set<String>; // A list of arguments for the transformation (size varies based on transformation type)
}