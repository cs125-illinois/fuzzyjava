package edu.illinois.cs.cs125.fuzzyjava.edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.RemoveSemicolons
import edu.illinois.cs.cs125.fuzzyjava.antlr.JavaLexer
import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.matchers.string.shouldEndWith
import io.kotlintest.matchers.string.shouldNotContain
import io.kotlintest.matchers.string.shouldStartWith
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.StringSpec
import org.antlr.v4.runtime.CharStreams
import java.io.File

class TestFuzz : StringSpec({
    val block = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/block.txt").readText().trim()
    val block1 = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/block1.txt").readText().trim()
    val block2 = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/block2.txt").readText().trim()
    val block3 = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/block3.txt").readText().trim()

    val unit = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/unit.txt").readText().trim()
    val unit1 = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/unit1.txt").readText().trim()
    val unit2 = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/unit2.txt").readText().trim()
    val unit3 = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/unit3.txt").readText().trim()
    val unit4 = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/unit4.txt").readText().trim()

    // Core Fuzzing - Comparisons, Identifiers, Literals

    "should not modify blocks without fuzz" {
        val source = block
        val fuzzedSource = fuzzBlock(source)
        fuzzedSource shouldBe source
    }
    "should implement fuzzy comparisons on blocks" {
        val source = block1
        val fuzzedSource = fuzzBlock(source)
        fuzzedSource.lines()[2] shouldStartWith ("boolean k = (i")
        fuzzedSource.lines()[2] shouldContain "j && i"
        fuzzedSource.lines()[2] shouldEndWith ("j);")
    }

    "should implement fuzzy comparisons on compilation units" {
        val source = unit
        val fuzzedSource = fuzzCompilationUnit(source)
        fuzzedSource.lines()[4].trim() shouldStartWith ("boolean k = (i")
        fuzzedSource.lines()[4] shouldContain "j && i"
        fuzzedSource.lines()[4] shouldEndWith ("j);")
    }

    "should implement fuzzy variable identifiers on compilation units" {
        val source = unit1
        val fuzzedSource = fuzzCompilationUnit(source)
        val charStream = CharStreams.fromString(fuzzedSource)
        val javaLexer = JavaLexer(charStream)

        val variables = HashMap<String, Int>()
        val parsedTokens = javaLexer.allTokens.map {
            it.text
        }.filter {
            it.matches("cs125Id_[0-9]+".toRegex()) //Todo: Will have to change this check when we know the signature of the ids we wish to generate
        }

        for (token in parsedTokens) {
            variables[token] = variables.getOrDefault(token,0) + 1
        }
        variables.values.size shouldBe 6 //Two of these is a non-fuzzy variable
        val variableFrequencies = variables.values.toMutableList()
        variableFrequencies.sort()
        variableFrequencies shouldBe mutableListOf(1, 1, 2, 3, 4, 5)
        //println(fuzzedSource)
    }// Todo: figure out a better way to test these inputs

    "should use fuzzyIdentifiers if provided" {
        val source = unit1
        val fuzzConfiguration = FuzzConfiguration()
        val definedIdentifiers : Set<Pair<String, String>> =  setOf(Pair("VARIABLE", "i"), Pair("VARIABLE", "j"), Pair("VARIABLE", "k"))
        val fuzzedIdentifiers : Set<String> =  setOf("fizz", "buzz", "fizzbuzz")
        fuzzConfiguration.fuzzyIdentifierTargets = IdSupplier(definedIdentifiers, fuzzedIdentifiers.toMutableList()) // We specifically use toMutableList() in order to copy it rather than pass a reference to the original list
        val fuzzedSource = fuzzCompilationUnit(source, fuzzConfiguration)
        val charStream = CharStreams.fromString(fuzzedSource)
        val javaLexer = JavaLexer(charStream)

        val variables = HashMap<String, Int>()
        val parsedTokens = javaLexer.allTokens.map {
            it.text
        }.filter {
            fuzzedIdentifiers.contains(it)
        }

        for (token in parsedTokens) {
            variables[token] = variables.getOrDefault(token,0) + 1
        }
        variables.values.size shouldBe 2
        val variableFrequencies = variables.values.toMutableList()
        variableFrequencies.sort()
        variableFrequencies shouldBe mutableListOf(4, 5)
    }

    "should implement fuzzy method identifiers on compilation units" {
        val source = unit2
        val fuzzedSource = fuzzCompilationUnit(source)
        fuzzedSource shouldNotBe source
    }

    "should implement fuzzy class identifies on compilation units" {
        val source = unit3
        val fuzzedSource = fuzzCompilationUnit(source)
        fuzzedSource shouldNotBe source
    }

    "should implement fuzzy literals" {
        val source = block2
        val fuzzedSource = fuzzBlock(source)
        fuzzedSource shouldContain "int x = [0-9]+;".toRegex()
        fuzzedSource shouldContain "double y = [0-9]+\\.[0-9]+;".toRegex()
    }

    // Documentation

    "should generate documentation" {
        val source = block3
        val fuzzedSource = fuzzBlock(source)
        fuzzedSource shouldNotBe source
    }

    // AST Transformations

    "[remove-semicolons all]" {
        val source = unit1
        val fuzzConfiguration = FuzzConfiguration()
        fuzzConfiguration.fuzzyTransformations?.add(RemoveSemicolons(false))
        val fuzzedSource = fuzzCompilationUnitWithoutParse(source, fuzzConfiguration)
        fuzzedSource shouldNotContain(";")
    }

    /**

    "[for-each-to-for array iterable all]" {
        val source = unit4
        val fuzzConfiguration = FuzzConfiguration()
        fuzzConfiguration.fuzzyTransformations?.add(ConvertForEachToFor(true, true, false))
        val fuzzedSource = fuzzCompilationUnit(source, fuzzConfiguration)
        fuzzedSource shouldNotContain("Integer i : array") // Array converted
        fuzzedSource shouldContain("i = 0; i < array.length; i++")
        fuzzedSource shouldNotContain("Integer i : iterable") // Iterable converted
        fuzzedSource shouldContain("Iterator<Integer> it = iterable.iterator(); it.hasNext();")
    }

    "[for-each-to-for array all]" {
        val source = unit4
        val fuzzConfiguration = FuzzConfiguration()
        fuzzConfiguration.fuzzyTransformations?.add(ConvertForEachToFor(true, false, false))
        val fuzzedSource = fuzzCompilationUnit(source, fuzzConfiguration)
        fuzzedSource shouldNotContain("Integer i : array") // Array converted
        fuzzedSource shouldContain("i = 0; i < array.length; i++")
        fuzzedSource shouldContain("Integer i : iterable") // Iterable NOT converted
        fuzzedSource shouldNotContain("Iterator<Integer> it = iterable.iterator(); it.hasNext();")
    }

    "[for-each-to-for iterable all]" {
        val source = unit4
        val fuzzConfiguration = FuzzConfiguration()
        fuzzConfiguration.fuzzyTransformations?.add(ConvertForEachToFor(false, true, false))
        val fuzzedSource = fuzzCompilationUnit(source, fuzzConfiguration)
        fuzzedSource shouldContain("Integer i : array") // Array NOT converted
        fuzzedSource shouldNotContain("i = 0; i < array.length; i++")
        fuzzedSource shouldNotContain("Integer i : iterable") // Iterable converted
        fuzzedSource shouldContain("java.util.Iterator<Integer> it = iterable.iterator(); it.hasNext();")
    }
    */
})