package io.demo.chapter2

fun main() {
//    for (i in 1..10) {
//        println("${i}번째: 내 이름은 참새")
//    }
//
//    println()
//
//    var i = 0
//    while (i < 10) {
//        println("${i}번졔: 내 이름은 까마귀")
//        i++
//    }
//
    findSparrow()

}

fun findSparrow() {

    val infos = arrayOf("꿩", "딝", "참새", "오목눈이", "공작새")

    for (info in infos) {
        if (info == "참새") {
            println("찾았다 참새!")
            break
        } else {
            println(1)
            continue
            println(2)
        }
    }

}
