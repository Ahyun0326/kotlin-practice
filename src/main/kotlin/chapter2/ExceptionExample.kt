package io.demo.chapter2

fun main() {
    val string = "asdf"
    println(safeIntegerConversion(string))

    try {
        validateInput("")
    } catch (e: IllegalArgumentException) {
        println("Caught an exception: ${e.message}")
    }
}

fun safeIntegerConversion(value: String): Int {
    return try {
        value.toInt()
    } catch (e: NumberFormatException) {
        0
    }
}

fun validateInput(input: String) {
    if (input.isBlank()) {
        throw IllegalArgumentException("Input should not be blank.")
    }
    println("Input is valid: $input")
}