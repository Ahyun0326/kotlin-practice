package chapter3

class Armor(
    val defensePoint: Int,
) {
    fun getDefensePoint(damage: Int) : Int {
        return damage - defensePoint
    }
}

class Character4 (
  val armor: Armor?,
) {
    var damage = 10
    var healthPoint = 100

    fun attack(target: Character3) {
        target.takeAttack(damage)
    }

    fun takeAttack(damage: Int) {
        var defensedDamage = armor?.getDefensePoint(damage) ?: damage

        println(defensedDamage)

        healthPoint -= defensedDamage
    }
}

fun main() {
    val characterWithoutArmor = Character4(null)
    val characterWithArmor = Character4(Armor(3))

    characterWithoutArmor.takeAttack(10)
    println(characterWithoutArmor.healthPoint)

    characterWithArmor.takeAttack(10)
    println(characterWithArmor.healthPoint)
}