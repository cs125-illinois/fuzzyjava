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

    val unit = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/unit.txt").readText().trim()
    val unit1 = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/unit1.txt").readText().trim()
    val unit2 = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/unit2.txt").readText().trim()
    val unit3 = File("/Users/arjunvnair/IdeaProjects/fuzzyjava/src/test/resources/unit3.txt").readText().trim()

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
    "should implement fuzzy method identifiers on compilation units" {
        val source = unit2
        val fuzzedSource = fuzzCompilationUnit(source)
        fuzzedSource shouldNotBe source
        //println(fuzzedSource)
    }
    "should implement fuzzy class identifies on compilation units" {
        val source = unit3
        val fuzzedSource = fuzzCompilationUnit(source)
        fuzzedSource shouldNotBe source
        //println(fuzzedSource)
    }
    "should implement fuzzy literals" {
        val source = """ 
int x = ?int=num0;
double y = ?double=num1;
""".trim()
        val fuzzedSource = fuzzBlock(source)
        fuzzedSource shouldContain "int x = [0-9]+;".toRegex()
        fuzzedSource shouldContain "double y = [0-9]+\\.[0-9]+;".toRegex()
    }
    "should generate documentation" {
        val source = """
int ?i = 0;
double ?j = 0.0;
/*Change the comparison operators so that ?i is no longer ?=comp0? ?int=num0
 *and "Goodbye" prints the console.
 */
if (?i ?=comp0? ?int=num0) {
    System.out.println("Hello");
} else if (?j ?=comp1? ?double=num1) {
    System.out.println("Goodbye");
}
""".trim()
        val fuzzedSource = fuzzBlock(source)
        fuzzedSource shouldNotBe source
    }


    "should remove semicolons if [remove-semicolons all] transformation is applied" {
        val source = """
public class Main {
    public static void main() {
        String ?name = "CS";
        int ?age = 125;
        ?class ?object = new ?class(?name, ?age);
        System.out.println("Name: " + ?object.?getName());
        System.out.println("Age: " + ?object.?getAge());
        
        ?object.?setName("CS");
        ?object.?setAge(173);
        System.out.println(?object);
    }
    class ?class {
        private String ?field1;
        private int ?field2;
        ?class(final String ?field1, final int ?field2) {
            this.?field1 = ?field1;
            this.?field2 = ?field2;
        }
        String ?getName() {
            return ?field1;
        }
        int ?getAge() {
            return ?field2;
        }
        void ?setName(final String ?newName) {
            ?field1 = ?newName;
        }
        void ?setAge(final int ?newAge) {
            ?field2 = ?newAge;
        }
        
        @Override
        public String toString() {
            return "Name: " + ?field1 + "\nAge: " + ?field2;
        }
    }
}
""".trim()
        val fuzzConfiguration = FuzzConfiguration()
        fuzzConfiguration.fuzzyTransformations?.add(RemoveSemicolons(false))
        val fuzzedSource = fuzzCompilationUnitWithoutParse(source, fuzzConfiguration)

        fuzzedSource shouldNotContain(";")
    }
})