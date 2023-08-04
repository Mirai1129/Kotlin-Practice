fun main() {
    val mapOfFruit = mapOf("Apple" to 3, "Banana" to 5, "Orange" to 7)
    val mutableMapOfFruit = mutableMapOf("Apple" to 7, "Banana" to 5, "Orange" to 7)
//    上面可以寫成下面
//    val setOfFruit = mapOf(
//        Pair("Apple", 7),
//        Pair("Banana", 5),
//        Pair("Orange", 7)
//    )
//    val mutableMapOfFruit = mutableMapOf(
//        Pair("Apple", 7),
//        Pair("Banana", 5),
//        Pair("Orange", 7)
//    )

    val emptyMap = mapOf<String, Int>() // 型別是 Map<String, Int>
    val mutableEmptyMap = mutableMapOf<String, Int>() // 型別是 MutableMap<String, Int>
    val emptyMapByEmptyMap = emptyMap<String, Int>() // 型別是 Map<String, Int>

    val price = mapOfFruit["Apple"] // 取得 Key 是 Apple 的值

    for (fruit in mapOfFruit) {
        println("${fruit.key} (${fruit.value})")
        // 會依序印出
        // Apple (3)
        // Banana (5)
        // Orange (7)
    }

    val size = mapOfFruit.size // 以屬性取得 Map 的大小
    val count = mapOfFruit.count() // 以方法取得 Map 的大小
    val keys = mapOfFruit.keys // 以屬性取得 Map 的所有 Key
    val value = mapOfFruit.values // 以屬性取得 Map 的所有 Value
}
