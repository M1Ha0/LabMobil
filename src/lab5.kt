fun sumLists(list1: List<Int>, list2: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in list1.indices) {
        result.add(list1[i] + list2[i])
    }
    return result
}

// Пример использования
fun main() {
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf(5, 6, 7, 8)

    val result = sumLists(list1, list2)
    println(result)
}
