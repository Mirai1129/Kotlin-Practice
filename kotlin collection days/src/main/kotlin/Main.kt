fun main() {
    val listOfNumbers = listOf(2, 3, 5, 6, 7) // 容量與內容都不可變的 List
    val mutableListOfNumbers = mutableListOf(2, 3, 5, 6, 7) // 可以動態改變容量及內容的 MutableList
    val emptyList = listOf<Int>()
    val emptyMutableList = mutableListOf<Int>()
    val emptyListByEmptyList = emptyList<Int>()

    val firstValue = listOfNumbers[0] // 通常用這個方式, [] 是 operator, override get 方法
    val secondValue = listOfNumbers.get(2)

    val size = listOfNumbers.size // 以屬性取得 List 的大小
    val sum = listOfNumbers.sum() // 計算出 List 裡所有數字的總合
    val average = listOfNumbers.average() // 計算出 List 裡所有數字的平均值
    val min = listOfNumbers.minOrNull() // 取出 List 裡的最小值或 Null
    val max = listOfNumbers.maxOrNull() // 取出 List 裡的最大值或 Null

    for (item in listOfNumbers) {
        println(item) // 會一行一行印出 2 3 5 6 7
    }
}
