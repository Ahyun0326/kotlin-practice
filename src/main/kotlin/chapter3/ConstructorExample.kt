package chapter3

class Character5(   // 주 생성자: 클래스 선언부에 생성자 명시
    var name: String,
    var hairColor: String,
    var height: Double,
) {

    var age: Int = 0
    var gender: String = ""

    fun fireball() {
        println("파이어볼!")
    }

    constructor(_name: String, _hairColor: String, _height: Double, _age: Int, _gender: String): this(_name, _hairColor, _height){
        age = _age
        gender = _gender
    }

    override fun toString(): String {
        return "$name $hairColor $height $age $gender"
    }
}

fun main() {
    val character1 = Character5("홍길동", "검정", 180.0)
    println(character1.toString())
    val character2 = Character5("이무개", "검정", 175.0, 25, "남자")
    println(character2.toString())
}