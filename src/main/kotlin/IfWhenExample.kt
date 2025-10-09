package io.demo

fun main() {
//    averageCalc()
    getLuckyFortune()
}

fun averageCalc() {
    val koreanScore = readLine()!!.toInt()
    val englishScore = readLine()!!.toInt()
    val mathScore = readLine()!!.toInt()

    val average = (koreanScore + englishScore + mathScore) / 3

    if (average >= 90) {
        println("당신의 등급은 A입니다.")
    } else if (average > 80) {
        println("단신의 등급은 B입니다.")
    } else if (average > 70) {
        println("당신의 등급은 C입니다.")
    } else {
        println("당신의 등급은 F입니다.")
    }
}

fun getLuckyFortune() {
    var todayNumber = readLine()!!.toInt()

    when (todayNumber) {
        1 -> {
            println("제물이 들어올것입니다")
        }
        2 -> {
            println("검정색을 조심하세요")
        }
        3 -> {
            println("지인과의 관계에 조심하세요")
        }
        else -> {
            println("물을 조심하십시오")
        }
    }
}