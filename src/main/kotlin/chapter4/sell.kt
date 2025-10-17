package chapter4

fun main() {
    val market = Market()

    market.sell()
}

class Item(
    val name: String,
    var stock: Int
) {

    fun sell(count: Int) {
        val leftCountAfterSell = stock - count

        if (leftCountAfterSell < 0) {
            throw Exception("stock count가 부족해요!")
        }

        stock = leftCountAfterSell
    }
}

class Market {
    private val itemList = listOf(
        Item(name = "무기", stock = 1),
        Item(name = "갑옷", stock = 2),
        Item(name = "포션", stock = 2),
        Item(name = "음식", stock = 0),
        Item(name = "약초", stock = 1),
    )

    fun sell() {
        printWelcomeString()
        printItemSellableList()

        val itemNumberToBuy = getItemNumberToBuy()

        processSelling(itemNumberToBuy)
    }

    private fun printWelcomeString() {
        println("상점에 오신 것을 환영합니다.")
        println("구매하고 싶은 아이템 숫자를 입력해주세요.")
    }

    private fun printItemSellableList() {
        itemList.forEachIndexed{ index, item ->
            println("${index + 1}. ${item.name}")
        }
    }

    private fun getItemNumberToBuy(): Int {
        return readLine()!!.toInt()
    }

    private fun processSelling(itemNumberToBuy: Int) {
        val targetItem = itemList[itemNumberToBuy - 1]

        try {
            targetItem.sell(1)
        } catch (e: Exception) {
            println("재고가 부족합니다!")
            return
        }

        println("판매되었습니다!")
    }
}