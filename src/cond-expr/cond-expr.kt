fun main(args: Array<String>) {
    println("maxOf(1, 2): ${maxOf(1, 2)}")
    println("minOf(1, 2): ${minOf(1, 2)}")
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun minOf(a: Int, b: Int) = if (a > b) b else a
