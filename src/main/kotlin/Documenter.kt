package edu.illinois.cs.cs125.fuzzyjava

const val AUTHOR: String = "@author"
const val PARAMETER: String = "@param"
const val RETURN: String = "@return"

/**
 * A class that takes the modifications from generating a variant and documents the code.
 */
class Documenter {
    /**
     * The modifications from generating a variant.
     */
    private var modifications:MutableList<SourceModification> = mutableListOf()
    /**
     * Will concatenate the strings generated during inspection to create the JavaDoc.
     */
    private var javaDocBuilder = StringBuilder()

    /**
     * Adds a modification to the list of modifications seen so far.
     *
     * @param modification - A new modification.
     */
    fun addModification(modification:SourceModification) {
        modifications.add(modification)
    }

    /**
     * Generates descriptions of the modifications
     */
    fun inspectModifications(): String? {
        var inspectionsResults: MutableList<String> = mutableListOf() // Will contains descriptions of all of the modifications made to the original program

        val lineMap = HashMap<Int,MutableList<SourceModification>>() //Keeps track of variable on the same line Todo: Might have to change this when fuzzing entire blocks of code
        if (modifications.isEmpty()) {
            return getDefaultDoc()
        }
        for (modification in modifications) {
            if (lineMap.containsKey(modification.startLine)) {
                lineMap[modification.startLine]?.add(modification)
            } else {
                lineMap[modification.startLine] = mutableListOf(modification)
            }
        }
        lineMap.values.forEach {
            line -> line.sortBy {  it.startColumn }
        }
        lineMap.values.forEach {
            for ((index, modification) in it.withIndex()) {
                val fuzzyToken = modification.content
                var message = "The fuzzy "
                message += when (fuzzyToken) {
                    FUZZY_COMPARISON -> "comparison: $fuzzyToken "
                    else -> {
                        // Todo: Don't forget to change this when you change how variable names are generated and make other elements fuzzable
                        "identifier: $fuzzyToken "
                    }
                }
                val difference = modification.endColumn - modification.replace.length
                message += "on line " + modification.startLine + " column " + difference + " was mapped to " + modification.replace + "."
                inspectionsResults.add(message)
                for (nextModificationIndex in index until it.size - 1) {
                    it[nextModificationIndex].startColumn -= difference //Todo: FIX THIS
                }
            }
        }

        val results = if (inspectionsResults.size == 0) "None..." else inspectionsResults.joinToString(separator = "\n* ")
        modifications.clear()
        inspectionsResults.clear()
        return results
    }

    private fun getDefaultDoc(): String {
        return ""//defaultDoc //Todo: implement this
    }

    private fun documentFeilds() {

    }

    private fun documentMethods() {

    }
}