package io.demo.chapter2

fun main() {

    // 기본타입 형변환
    val intString: String = "123"
    println(intString + 5)

    val int = intString.toInt()
    println(int + 123)

    // 스마트 캐스트: 조건문을 통해 타입을 검사해서 안전하게 형번환
    val value: Any = "this is any type value"
    if (value is String) {
        println(value.length)
    }

    // 명시적 형변환
    value as String
    println(value.length)
}