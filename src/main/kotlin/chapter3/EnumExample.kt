package chapter3

enum class ProgrammingLanguage {
    C, JAVA, KOTLIN
}

enum class ProgrammingLanguageWithInt(val code: Int) {
    C(10),
    JAVA(20),
    KOTLIN(30)
}

fun main() {
    println(ProgrammingLanguage.C)
    println(ProgrammingLanguage.C.toString())
    println(ProgrammingLanguageWithInt.KOTLIN.code)
    println(ProgrammingLanguageWithInt.KOTLIN.name)
}
