package chapter3

interface Character2 {
    fun attack(target: Character2)
    fun takeAttack(damage: Int)
}

class Hero: Character2 {
    val damage = 10
    var healthPoint = 100

    override fun attack(target: Character2) {
        println("공격했다!")
        target.takeAttack(this.damage)
    }

    override fun takeAttack(damage: Int) {
        println("공격받았다!")
        this.healthPoint -= damage
    }

}

class Enemy: Character2 {
    val damage = 10
    var healthPoint = 100

    override fun attack(target: Character2) {
        println("공격했다!")
        target.takeAttack(this.damage)
    }

    override fun takeAttack(damage: Int) {
        println("공격받았다!")
        this.healthPoint -= damage
    }
}