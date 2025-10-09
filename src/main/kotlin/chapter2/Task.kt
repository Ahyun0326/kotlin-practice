package io.demo.chapter2

fun main() {

    var isValidMenu = false
    var selectedMenu = 0

    while (isValidMenu == false) {
        try {
            selectedMenu = getMenuNumber()
            isValidMenu = true
        } catch (e: Exception) {
            isValidMenu = false
        }
    }

    when (selectedMenu) {
        1 -> startGame()
        2-> showCharacterMenu()
        3 -> endGame()
    }
}

fun getMenuNumber() : Int{
    println("메뉴를 입력해주세요.")
    println("1. 게임 시작하기")
    println("2. 캐릭터 추가하기")
    println("3. 게임 끝내기")

    val userInput = readLine()!!.toInt()
    if (userInput < 1 || userInput > 3) {
        throw Exception("입력이 잘못되었습니다.")
    }

    return userInput
}

fun startGame() {
    println("게임이 시작되었습니다")
}

fun endGame() {
    println("게임이 종료되었습니다")
}

fun showCharacterMenu() {
    val characterList: MutableList<Map<String, String>> = mutableListOf()

    var characterMenu = "Y"
    while (characterMenu == "Y") {

        print("추가할 캐릭터 이름 입력: ")
        val name = readLine() ?: ""

        print("추가할 캐릭터 직업 입력: ")
        val job = readLine() ?: ""

        val character: Map<String, String> = mapOf("name" to name, "job" to job)
        characterList.add(character)

        println("캐릭터를 더 추가하시겠습니까? (Y: 캐릭터 추가, N: 그만두기)")
        characterMenu = readLine() ?: "N"
    }

    characterList.forEach { println(it) }

}

