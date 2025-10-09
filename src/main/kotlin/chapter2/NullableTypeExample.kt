package io.demo.chapter2

fun main() {
    /**
     * nullable type 검사 방법
     */

    // 1. 조건문 검사
    val nullableString: String? = "this is nullable string"
    if (nullableString != null) {
        println(nullableString.length)
    }

    // 2. elvis 연산자: 변수가 null일 경우 대신 사용할 값 지정
    val nullableString2: String? = null
    println((nullableString2 ?: "").length)

    // 3. 세이프 콜: 변수가 null이 아닐 경우에만 실행할 구문 지정
    var nullableString3: String? = "this is nullable string3"
    nullableString3?.let { println(it.length) }

    // 4. 단언 연산자: 변수가 null이 아님을 개발자가 확신할 수 있을 경우 사용
    val nullableString4: String? = "this is nullable string4"
    println(nullableString4!!.length)

}