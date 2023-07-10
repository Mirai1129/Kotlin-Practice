fun main() {
    val myName: String = "Mirai"
    val myId: Int = 1129
    val targetArgument = callName(myName)

    printOnTerminal(targetArgument)
}

fun callName(name: String = "everyone"): String {
    return "Hello $name"
}

fun printOnTerminal(arg: String) {
    println(arg)
}
