package chapter4

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.collections.shouldExist
import io.kotest.matchers.collections.shouldNotContain
import io.kotest.matchers.shouldBe

class BagTest : BehaviorSpec({
    Given("a valid max weight") {
        val validMaxWeight = 10

        When("execute constructor") {
            val result = Bag(validMaxWeight)

            Then("max weight should be valid max weight") {
                result.maxWeight shouldBe validMaxWeight
            }
        }
    }

    Given("a max weight = 0") {
        val maxWeight = 0

        When("execute constructor") {
            val exception = shouldThrow<Exception> { Bag(maxWeight) }

            Then("exception message should be expected") {
                exception.message shouldBe "가방의 최대 무게가 잘못 설정되었습니다."
            }
        }
    }

    Given("a max weight is negative") {
        val maxWeight = -10

        When("execute constructor") {
            val exception = shouldThrow<Exception> { Bag(maxWeight) }

            Then("exception message should be expected") {
                exception.message shouldBe "가방의 최대 무게가 잘못 설정되었습니다."
            }
        }
    }

    Given("a Bag and a Item") {
        val bag = Bag(10)
        val item = Item2("item", 5)

        When("execute putItem") {
            bag.putItem(item)

            Then("item is in itemList of bag") {
                bag.itemList.size shouldBe 1
                bag.itemList.first() shouldBe item
            }
        }
    }

    Given("a Bag and a too heavy Item") {
        val bag = Bag(5)
        val item = Item2("item", 10)

        When("execute putItem") {
            val exception = shouldThrow<Exception> { bag.putItem(item) }

            Then("exception message should be expected") {
                exception.message shouldBe "가방에 아이템을 넣을 수 없습니다."
            }
        }
    }

    Given("a Bag has Item") {
        val bag = Bag(10)
        val item = Item2("item", 5)
        bag.putItem(item)

        When("execute removeItem") {
            bag.removeItem(item)

            Then("item is not in itemList of bag") {
                bag.itemList.size shouldBe 0
            }
        }
    }

    Given("a Bag has many Items") {
        val bag = Bag(100)

        val items = listOf(
            Item2("item1", 5),
            Item2("item2", 5),
            Item2("item3", 5)
        )

        items.forEach {
            bag.putItem(it)
        }

        When("execute removeItem") {
            val targetItem = items[1]
            bag.removeItem(targetItem)

            Then("item is not in itemList of bag") {
                bag.itemList.size shouldBe items.size - 1
                bag.itemList shouldNotContain targetItem
            }
        }
    }

    Given("a Bag without Item") {
        val bag = Bag(10)

        When("execute removeItem") {
            val targetItem = Item2("item", 5)
            bag.removeItem(targetItem)

            Then("item is not in itemList of bag") {
                bag.itemList.size shouldBe 0
                bag.itemList shouldNotContain targetItem
            }

        }

    }
})
