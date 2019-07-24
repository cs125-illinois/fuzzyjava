package edu.illinois.cs.cs125.fuzzyjava

// Todo: Make this flexible enough for ALL identifiers (variable, class, enum, method, interface, ect.)
/**
 * A class that lazily generates an infinite sequence of ids.
 *
 * Used by [FuzzConfiguration.fuzzyIdentifierTargets].
 */
class IdSupplier(private val definedIdentifiers: Set<Pair<String, String>>) {
    /**The infinite sequence of identifiers to choose from.*/
    private var sequence = Sequence { object : Iterator<String> {
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
     * Getter method for the next identifier in the [sequence].
     *
     * @return The next identifier in the [sequence].
     */
    val nextId: String
        get() {
            val newId = sequence.first()
            sequence = sequence.drop(1)
            return newId
        }

}