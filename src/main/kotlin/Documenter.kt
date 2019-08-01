package edu.illinois.cs.cs125.fuzzyjava

private const val EQUAL_TO = "equal to"
private const val GREATER_THAN = "greater than"
private const val GREATER_THAN_OR_EQUAL_TO = "greater than or equal to"
private const val LESS_THAN = "less than"
private const val LESS_THAN_OR_EQUAL_TO = "less than or equal to"
private const val NOT_EQUAL_TO = "not equal to"

/**
 * A class that takes the modifications from generating a variant and documents the code.
 */
class Documenter(private val source: String, private var modifications: Set<SourceModification>) {
    /**
     * Generates descriptions of the modifications
     */
    fun generate(): String {
        var results : String = source
        for (modification in modifications) {
            if (modification.content.contains(FUZZY_COMPARISON)) {
                var replacement = ""
                when (modification.replace) {
                    "==" -> replacement = EQUAL_TO
                    ">" -> replacement = GREATER_THAN
                    ">=" -> replacement = GREATER_THAN_OR_EQUAL_TO
                    "<" -> replacement = LESS_THAN
                    "<=" -> replacement = LESS_THAN_OR_EQUAL_TO
                    "!=" -> replacement = NOT_EQUAL_TO
                }
                assert(replacement != "")
                results = results.replace(modification.content, replacement)
                continue
            }
            //Space added to the content so that fuzzy ids like ?i do not class with fuzzy literals ?int...
            results = results.replace(modification.content + " ", modification.replace + " ")
        }
        return results
    }

}