package edu.illinois.cs.cs125.fuzzyjava

import io.kotlintest.specs.StringSpec
import io.kotlintest.*
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
    }
})
