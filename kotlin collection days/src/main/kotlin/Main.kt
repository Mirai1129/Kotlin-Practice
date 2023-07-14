fun main() {
    val setOfNames = setOf("Jim", "Sue", "Sue", "Nick", "Nick") // 只存放不重複的 Jim, Sue, Nick
    val mutableSetOfNames = mutableSetOf("Jim", "Sue", "Sue", "Nick", "Nick") // 只存放不重複的 Jim, Sue, Nick

    val emptySet = setOf<String>()
    val emptyMutableSet = mutableSetOf<String>()
    val emptySetByEmptySet = emptySet<String>()

    val secondName = setOfNames.elementAt(1) // 取得放在第 2 格的元素

    for (name in setOfNames) {
        println(name) // 會一行一行印出 Jim Sue Nick
    }

    val setOfNumbers = setOf(2, 3, 3, 6, 7, 10)
    val size = setOfNumbers.size // 以屬性取得 Set 的大小
    val sum = setOfNumbers.sum() // 計算出 Set 裡所有數字的總合
    val average = setOfNumbers.average() // 計算出 Set 裡所有數字的平均值
    val min = setOfNumbers.minOrNull() // 取出 Set 裡的最小值或 Null
    val max = setOfNumbers.maxOrNull() // 取出 Set 裡的最大值或 Null
}
