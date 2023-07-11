fun main() {
    val arrayOfNumbers = arrayOf(2, 3, 5, 6, 10)
    val intArray = intArrayOf(2, 3, 5, 10)
    val size = arrayOfNumbers.size // 以屬性取得 Array 的大小
    val sum = arrayOfNumbers.sum() // 計算出 Array 裡所有數字的總合
    val average = arrayOfNumbers.average() // 計算出 Array 裡所有數字的平均值
    val first = arrayOfNumbers.first() // 取出第一格資料
    val last = arrayOfNumbers.last() // 取出最後一格資料
    val min = arrayOfNumbers.minOrNull() // 取出 Array 裡的最小值或 Null
    val max = arrayOfNumbers.maxOrNull() // 取出 Array 裡的最大值或 Null
    val firstValue = arrayOfNumbers[0] // 取得 index 是 0 的值

    for (item in arrayOfNumbers) {
        println(item) // 會一行一行印出 2 3 5 6 10
    }
}
