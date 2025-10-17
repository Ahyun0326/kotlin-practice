package chapter4

data class Item2(
    var name: String,
    var weight: Int,
)

class Bag (
    val maxWeight: Int,
) {
    init {
        if (maxWeight <= 0) {
            throw Exception("가방의 최대 무게가 잘못 설정되었습니다.")
        }
    }

    val itemList: MutableList<Item2> = mutableListOf()

    // 컬렉션의 요소를 누적하여 더해 반환
    val currentWeight = this.itemList.fold(0) { acc, item -> acc + item.weight }

    fun putItem(item: Item2) {
        if (item.weight + currentWeight > maxWeight) {
            throw Exception("가방에 아이템을 넣을 수 없습니다.")
        }

        this.itemList.add(item)
    }

    fun removeItem(item: Item2) {
        this.itemList.remove(item)
    }
}