package io.demo.chapter2

fun main() {
    // Mutable List
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)

    mutableList.add(5)
    mutableList.remove(1)

    println(mutableList)

    // Immutable List
    val immutableList: List<String> = listOf("apple", "banana", "orange")

    println(immutableList)

    // Mutable Map
    val fruitCount: MutableMap<String, Int> = mutableMapOf("apple" to 5, "banana" to 3, "orange" to 8)

    println(fruitCount)
    println(fruitCount["apple"])
    println(fruitCount["banana"])
    println(fruitCount["orange"])

    fruitCount["lemon"] = 12
    fruitCount.remove("banana")

    println(fruitCount)

    // 고차함수: 함수를 매개변수로 받거나 함수를 반환하는 함수
    val multifly: (a: Int, b: Int) -> Int = { a, b -> a * b}
    println(multifly(3,5 ))

    val numbers = listOf(1, 2, 3, 4, 5)
    val printFunction = { value: Int -> println(value) }

//    numbers.forEach { value -> println(value) }
    numbers.forEach { println(it) }
    numbers.forEach(printFunction)

    // 고차함수 활용
    val list = listOf("apple", "banana", "orange")
    println(list)

    val mapFromList = list.associateWith { it.length }  // 리스트를 맵으로 변환
    println(mapFromList)

    val map = mapOf("apple" to 5, "banana" to 3, "orange" to 8)
    println(map)

    val listFromMap = map.toList()  // 맵을 리스트로 변환
    println(listFromMap)

    val people = listOf(
        mapOf("name" to "김르탄", "age" to 27),
        mapOf("name" to "이스파", "age" to 18),
        mapOf("name" to "최개발", "age" to 54),
        mapOf("name" to "박코딩", "age" to 32),
    )

//    people.forEach { println(it) }

    people.filter {
        val age = it["age"]

        if (age is Int) {
            age >= 30
        } else {
            false
        }
    }.forEach{ println(it) }



}