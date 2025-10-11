package chapter3

fun main() {
    var bird = Bird("새")
    var chicken = Chicken("닭",2 )
    var sparrow = Sparrow("참새", "갈색")
    var pigeon = Pigeon("비둘기", "서울")

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}

open class Bird(
    var name: String
) {
    open fun fly() {
        println("${name} 날아요~")
    }
}

class Chicken(
    name: String,
    val age: Int,
) : Bird(name) {

    override fun fly() {
        println("${age}살의 ${name}가 날아봅니다~ 꼬끼오!")
    }
}

class Sparrow(
    name: String,
    val color: String
) : Bird(name) {

    override fun fly() {
        println("${color}의 ${name}이 날아봅니다~ 짹짹!")
    }
}

class Pigeon(
    name: String,
    val address: String
) : Bird(name) {

    override fun fly() {
        println("${address} 살고있는 ${name}가 날아봅니다~ 구구!")
    }
}