package edu.illinois.cs.cs125.fuzzyjava
// Todo: Make this flexible enough for ALL identifiers (variable, class, enum, and method names)
/**
 * A class that lazily generates an infinite sequence of ids
 */
class IdSupplier(private val definedIdentifiers: Set<Pair<String, String>>) {
    private var sequence = Sequence { object : Iterator<String> {
        val identifierPrefix = "cs125Id_" // Todo: Will probably end up changing this
        var next = 0 // start at -1 so first number used is 0
        override fun hasNext(): Boolean {return true}
        override fun next(): String {
            return identifierPrefix + next++
        }
    } }.filter { Pair(VARIABLE, it) !in definedIdentifiers } // Only care about variables right now, will change for other namespaces later

    val nextId: String
        get() {
            val newId = sequence.first()
            sequence = sequence.drop(1)
            return newId
        }

}