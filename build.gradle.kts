import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlinVersion = "1.3.41"
    kotlin("jvm") version kotlinVersion
    antlr
    java
    maven
    id("com.github.ben-manes.versions") version "0.21.0"
}
repositories {
    jcenter()
    maven(url="https://jitpack.io")
}
dependencies {
    antlr("org.antlr:antlr4:4.7.2")

    implementation(kotlin("stdlib"))
    implementation("org.slf4j:slf4j-api:1.7.26")
    implementation("ch.qos.logback:logback-classic:1.2.3")
    implementation("io.github.microutils:kotlin-logging:1.6.26")

    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.3.3")
}
tasks.compileKotlin {
    dependsOn(tasks.generateGrammarSource)

    val javaVersion = JavaVersion.VERSION_1_8.toString()
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
    kotlinOptions {
        jvmTarget = javaVersion
    }
}
tasks.test {
    useJUnitPlatform()
    jvmArgs("-ea", "-Xmx1G")
    systemProperties["logback.configurationFile"] = File(projectDir, "src/test/resources/logback-test.xml").absolutePath
}
tasks.generateGrammarSource {
    outputDirectory = File(projectDir, "src/main/java/edu/illinois/cs/cs125/fuzzyjava/antlr")
    arguments.addAll(listOf("-visitor", "-package", "edu.illinois.cs.cs125.fuzzyjava.antlr", "-Xexact-output-dir"))
}
tasks.dependencyUpdates {
    resolutionStrategy {
        componentSelection {
            all {
                if (listOf("alpha", "beta", "rc", "cr", "m", "preview", "b", "ea", "eap").any { qualifier ->
                    candidate.version.matches(Regex("(?i).*[.-]$qualifier[.\\d-+]*"))
                }) {
                    reject("Release candidate")
                }
            }
        }
    }
}
