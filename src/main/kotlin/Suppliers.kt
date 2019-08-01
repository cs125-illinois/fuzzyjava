package edu.illinois.cs.cs125.fuzzyjava

import kotlin.math.roundToInt

// Todo: Make this flexible enough for ALL identifiers (variable, class, enum, method, interface, ect.)
/**
 * A class that lazily generates an infinite sequence of ids.
 *
 * Used by [FuzzConfiguration.fuzzyIdentifierTargets].
 */
class IdSupplier(private val definedIdentifiers: Set<Pair<String, String>>) {
    /**The infinite sequence of identifiers to choose from.*/
    private var sequenceOfIds = Sequence { object : Iterator<String> {
        val identifierPrefix = "cs125Id_" // Todo: Will probably end up changing this
        var next = 0 // start at -1 so first number used is 0
        override fun hasNext(): Boolean {return true}
        override fun next(): String {
            return identifierPrefix + next++
        }
    } }.filter { Pair(CLASS, it) !in definedIdentifiers &&
            Pair(ENUM_CONSTANT, it) !in definedIdentifiers &&
            Pair(METHOD, it) !in definedIdentifiers &&
            Pair(VARIABLE, it) !in definedIdentifiers
    }
    /**
     * Getter method for the next identifier in the [sequenceOfIds].
     *
     * @return The next identifier in the [sequenceOfIds].
     */
    val nextId: String
        get() {
            val newId = sequenceOfIds.first()
            sequenceOfIds = sequenceOfIds.drop(1)
            return newId
        }

}
//Todo: Change this class so that the user is able to provide lists of primitives into the constructor
//Sequences are just used in the initial implementation
/**
 * A class that generates primitive literals
 */
class LiteralSupplier {
    /**The infinite sequence of integers to choose from.*/
    private var sequenceOfInts = Sequence { object : Iterator<Int> {
        var next = 0
        override fun hasNext(): Boolean {return true}
        override fun next(): Int {
            next += (Math.random() * 100).roundToInt() //Todo: Just an initial implementation
            return next
        }
    } }
    /**The infinite sequence of doubles to choose from.*/
    private var sequenceOfDoubles = Sequence { object : Iterator<Double> {
        var next = 0.0
        override fun hasNext(): Boolean {return true}
        override fun next(): Double {
            next += (Math.random() * 100).roundToInt() + Math.random() //Todo: Just an initial implementation
            return next
        }
    } }
    fun next(primitiveType: String): String {
        var ret: Number = -1
        when (primitiveType) {
            "int" -> ret = nextInt
            "double" -> ret = nextDouble
        }
        assert(ret != -1) //Just for testing to make sure ret was reassigned
        return ret.toString()
    }
    /**
     * Getter method for the next integer in the [sequenceOfInts].
     *
     * @return The next integer in the [sequenceOfInts].
     */
    private val nextInt: Int
        get () {
            val newInt = sequenceOfInts.first()
            sequenceOfInts = sequenceOfInts.drop(1)
            return newInt
        }
    /**
     * Getter method for the next double in the [sequenceOfDoubles].
     *
     * @return The next double in the [sequenceOfDoubles].
     */
    private val nextDouble: Double
        get () {
            val newDouble = sequenceOfDoubles.first()
            sequenceOfDoubles = sequenceOfDoubles.drop(1)
            return newDouble
        }


}