package chapter3

open class Character3 {
    var damage = 10
    var healthPoint = 100

    fun attack(target: Character3) {
        target.takeAttack(damage)
    }

    open fun takeAttack(damage: Int) {
        healthPoint -= damage
    }
}

class CharacterWithArmor : Character3() {
    var depend = 5

    override fun takeAttack(damage: Int) {
        var actualDamage = damage - depend
        super.takeAttack(actualDamage)
    }
}