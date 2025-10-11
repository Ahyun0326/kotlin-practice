package chapter3

fun main() {
    var calc = Calculator()

    var intResult = calc.add(1, 2)
    var doubleResult = calc.add(1.2, 2.2)

    println("정수 덧셈결과: ${intResult}")
    println("실수 덧셈결과: ${doubleResult}")
}

class Calculator {
    fun add(a: Int, b: Int): Int {
        println("int형 add 입니다")
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        println("double형 add 입니다")
        return a + b
    }
}