package edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.antlr.JavaLexer
import io.kotlintest.specs.StringSpec
import io.kotlintest.*
import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.matchers.string.shouldEndWith
import io.kotlintest.matchers.string.shouldStartWith
import org.antlr.v4.runtime.CharStreams

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
    "should map fuzzed identifiers with same id to same replacement id" {
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
                if (guess) {
                    ?identifier = 10000;
                }
            }
            boolean ?guess = (true && false || true && (1 ?= 2));
            ?test += ?identifier + ?test;
        }
        ?identifier *= ?identifier;
        int ?some_number = (int) (Math.random() * j);
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
        variableFrequencies shouldBe mutableListOf(1, 1, 2, 3, 5)
    }
})