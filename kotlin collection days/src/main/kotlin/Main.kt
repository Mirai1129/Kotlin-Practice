fun main() {
    whenCondition()
    forScope()
}

fun whenCondition() {
    println("x = ???")
    // when 表達式
    when (readln().toInt()) {
        1 -> {
            println("x == 1")
        }
        2 -> {
            println("x == 2")
        }
        else -> {
            println("x is neither 1 nor 2")
        }
    }
}

fun forScope() {
    // for 迴圈
    val items = intArrayOf(1, 2, 3, 4, 5)

    for (item in items) {
        println(item)
    }
}
