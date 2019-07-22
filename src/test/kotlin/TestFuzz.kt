package edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.antlr.JavaLexer
import io.kotlintest.specs.StringSpec
import io.kotlintest.*
import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.matchers.string.shouldEndWith
import io.kotlintest.matchers.string.shouldStartWith
import org.antlr.v4.runtime.CharStreams
import java.util.*
import kotlin.collections.HashMap

class TestFuzz : StringSpec({
    "should not modify blocks without fuzz" {
        val source = """
int i = 0;
int j = 1;
""".trim()
        val fuzzedSource = fuzzBlock(source)
        fuzzedSource shouldBe source
    }
    "should implement fuzzy comparisons on blocks" {
        val source = """
int i = 0;
int j = 1;
boolean k = (i ?= j && i ?= j);
""".trim()
        val fuzzedSource = fuzzBlock(source)
        fuzzedSource.lines()[2] shouldStartWith ("boolean k = (i")
        fuzzedSource.lines()[2] shouldContain "j && i"
        fuzzedSource.lines()[2] shouldEndWith ("j);")
    }
    "should implement fuzzy comparisons on compilation units" {
        val source = """
public class Main {
    public static void main() {
        int i = 0;
        int j = 1;
        boolean k = (i ?= j && i ?= j);
    }
}
""".trim()
        val fuzzedSource = fuzzCompilationUnit(source)
        fuzzedSource.lines()[4].trim() shouldStartWith ("boolean k = (i")
        fuzzedSource.lines()[4] shouldContain "j && i"
        fuzzedSource.lines()[4] shouldEndWith ("j);")
    }
    "should recognize and replace fuzzy identifiers" {
        val source = """
int ?identifier;
int ?test = 1;
        """.trim()
        val fuzzedSource: String = fuzzBlock(source)
        fuzzedSource shouldNotBe source
    }
    "f:should map fuzzed identifiers with same id to same replacement id" {
        val source = """
public class Main {
    public static void main() {
        int i = 0;
        int j = 10;
        int ?identifier = 0;
        {
            float ?test = 1.0;
            {
                boolean ?guess;
                ?guess = false;
                if (?guess) {
                    ?identifier = 10000;
                }
            }
            boolean ?guess = (true && false || true && (?test ?= 2.0));
            ?test += ?identifier + ?test;
        }
        ?identifier *= ?identifier;
        int ?some_number;
        ?some_number = (int) (Math.random() * j);
        boolean k = (i ?= j && i ?= j) ? true : false;
    }
}
""".trim()
        val fuzzedSource = fuzzCompilationUnit(source)

        val charStream = CharStreams.fromString(fuzzedSource)
        val javaLexer = JavaLexer(charStream)

        val variables = HashMap<String, Int>()
        val parsedTokens = javaLexer.allTokens.map {
            it.text
        }.filter {
            it.startsWith("cs125")
        }

        for (token in parsedTokens) {
            variables[token] = variables.getOrDefault(token,0) + 1
        }

        variables.values.size shouldBe 5 //This is not 100% guaranteed to pass (must be able to generate unique ids)
        val variableFrequencies = variables.values.toMutableList()
        variableFrequencies.sort()
        variableFrequencies shouldBe mutableListOf(1, 2, 3, 4, 5)
        println(fuzzedSource)
    }
    /*"Documentation should make sense" {
        val source = """
int ?identifier = 1;

if (?identifier ?= 1) {
    System.out.println("cs125 rocks!");
}
""".trim()
        val fuzzedSource = fuzzBlock(source)
    }*/
})