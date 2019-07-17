package edu.illinois.cs.cs125.fuzzyjava

import io.kotlintest.specs.StringSpec
import io.kotlintest.*
import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.matchers.string.shouldEndWith
import io.kotlintest.matchers.string.shouldStartWith

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
})
