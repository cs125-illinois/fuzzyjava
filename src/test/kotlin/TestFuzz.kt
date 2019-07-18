package edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.antlr.JavaLexer
import io.kotlintest.specs.StringSpec
import io.kotlintest.*
import io.kotlintest.matchers.collections.shouldContainExactlyInAnyOrder
import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.matchers.string.shouldEndWith
import io.kotlintest.matchers.string.shouldStartWith
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

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
int ?identifier = 0;
{
    float ?test = 1.0;
    {
        boolean ?guess;
        ?guess = false;
    }
    boolean ?guess = true && false || true;
    ?test += ?identifier + ?test;
}
?identifier *= ?identifier;
""".trim()
        val fuzzedSource = fuzzBlock(source)

        val charStream = CharStreams.fromString(fuzzedSource)
        val javaLexer = JavaLexer(charStream)

        val variables = HashMap<String, Int>()
        val parsedTokens = javaLexer.allTokens.map {
            it.text
        }.filter {
            it.matches("[a-z_$][0-9]+".toRegex())
        }

        for (token in parsedTokens) {
            variables[token] = variables.getOrDefault(token,0) + 1
        }

        variables.values.size shouldBe 4 //Todo: This can still fail
        variables.values shouldContainExactlyInAnyOrder mutableListOf(4, 3, 2, 1)
    }
})