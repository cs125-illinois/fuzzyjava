package edu.illinois.cs.cs125.fuzzyjava

import edu.illinois.cs.cs125.fuzzyjava.antlr.JavaLexer
import io.kotlintest.specs.StringSpec
import io.kotlintest.*
import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.matchers.string.shouldEndWith
import io.kotlintest.matchers.string.shouldStartWith
import org.antlr.v4.runtime.CharStreams
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
        println(fuzzedSource)
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
    "should implement fuzzy variable identifiers on compilation units" {
        val source = """
public class Main {
    public static void main() {
        int cs125Id_0 = 0;
        int cs125Id_3 = 10;
        int ?identifier = 0;
        {
            float ?test = 1.0;
            {
                boolean ?guess;
                ?guess = false;
                if (?guess) {
                    float ?test = 2.0;
                    ?identifier = 10000;
                }
            }
            boolean ?guess = (true && false || true && (?test ?= 2.0));
            ?test += (float) ?identifier + ?test;
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
            it.matches("cs125Id_[0-9]+".toRegex()) //Todo: Will have to change this check when we know the signature of the ids we wish to generate
        }

        for (token in parsedTokens) {
            variables[token] = variables.getOrDefault(token,0) + 1
        }
        println(fuzzedSource)
        variables.values.size shouldBe 8 //Two of these is a non-fuzzy variable
        val variableFrequencies = variables.values.toMutableList()
        variableFrequencies.sort()
        variableFrequencies shouldBe mutableListOf(1, 1, 1, 1, 2, 3, 4, 5)
    }// Todo: figure out a better way to test these inputs
    "should implement fuzzy method identifiers on compilation units" {
        val source = """
//non-fuzzy ids = {0, 1, 3, 4, 6}
public class Main {
    static boolean ?foo(int a, int b) {
        return a ?= b;
    }
    private static void cs125Id_6(boolean ?bool) { 
        if (?bool) {
            System.out.println("cs125 rocks!");
        }
    }
    private void cs125Id_1(int ?some_int, boolean ?bool) {
        System.out.println(?bool && ?some_int ?= 1);
    }
    public static int cs125Id_4() {
        int ?int = 100;
        return ?int;
    }
    private static void ?another_method(float ?data) {
        return ?method(?data, 3.0);
    }
    private static void ?method(float ?data, float ?more_data) {
        return ?data ?= ?more_data;
    }
    public static void main() {
        int cs125Id_0 = 0;
        int cs125Id_3 = 10;
        boolean ?identifier = ?foo(cs125Id_0, cs125Id_3) || ?another_method((float) cs125Id_3) ?= ?another_method((float) cs125Id_0);
        System.out.println("The result was: " + ?identifier);
    }
}
""".trim()
        val fuzzedSource = fuzzCompilationUnit(source)
        fuzzedSource shouldNotBe source
        println(fuzzedSource)
    }
    "should implement fuzzy class identifies on compilation units" {
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
        val fuzzedSource = fuzzCompilationUnit(source)
        fuzzedSource shouldNotBe source
        println(fuzzedSource)
    }
})