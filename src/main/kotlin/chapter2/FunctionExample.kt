package io.demo.chapter2

fun main() {
//    val num1 = readLine()!!.toInt()
//    val num2 = readLine()!!.toInt()
//
//    sum(num1, num2)
//
//    displayInfo()

    val student1Score = 95
    val student2Score = 27
    val student3Score = 88

    val student1Rank = checkRank(student1Score)
    val student2Rank = checkRank(student2Score)
    val student3Rank = checkRank(student3Score)

    println("학생 1의 등급은: ${student1Rank}")
    println("학생 2의 등급은: ${student2Rank}")
    println("학생 3의 등급은: ${student3Rank}")
}

fun sum(num1: Int, num2: Int) {
    val result = num1 + num2
    println("연산 결과는 ${result} 입니다.")
}

// 반환 자료형이 없을 경우 Unit으로 명시하거나 생략 가능
fun displayInfo(): Unit {
    println("오늘의 날씨는 화창합니다")
    println("오늘은 검정색을 조심하세요")
}

fun checkRank(score: Int): String {
    return when (score) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "D"
    }

//    Kotlin 컨벤션을 따르지 않은 형태
//    if(score >= 90) {
//        return "A"
//    } else if(score >= 80) {
//        return "B"
//    } else if(score >= 70) {
//        return "C"
//    } else {
//        return "D"
//    }
// }

}