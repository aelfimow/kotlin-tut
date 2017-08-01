fun main(args: Array<String>) {
    println("maxOf(1, 2): ${maxOf(1, 2)}")
    println("maxOf(1, 2, 3): ${maxOf(1, 2, 3)}")
    println("maxOf(1, 2, 3, 4): ${maxOf(1, 2, 3, 4)}")
    println("maxOf(4, 3, 2, 1): ${maxOf(4, 3, 2, 1)}")
    println("minOf(1, 2): ${minOf(1, 2)}")
    println("minOf(1, 2, 3): ${minOf(1, 2, 3)}")
    println("minOf(1, 2, 3, 4): ${minOf(1, 2, 3, 4)}")
    println("minOf(4, 3, 2, 1): ${minOf(4, 3, 2, 1)}")
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b
fun maxOf(a: Int, b: Int, c: Int) = maxOf(a, maxOf(b, c))
fun maxOf(a: Int, b: Int, c: Int, d: Int) = maxOf(a, maxOf(b, c, d))

fun minOf(a: Int, b: Int) = if (a > b) b else a
fun minOf(a: Int, b: Int, c: Int) = minOf(a, minOf(b, c))
fun minOf(a: Int, b: Int, c: Int, d: Int) = minOf(a, minOf(b, c, d))
