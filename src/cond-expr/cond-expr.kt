fun main(args: Array<String>) {
    println("maxOf(1, 2): ${maxOf(1, 2)}")
    println("maxOf(1, 2, 3): ${maxOf(1, 2, 3)}")
    println("minOf(1, 2): ${minOf(1, 2)}")
    println("minOf(1, 2, 3): ${minOf(1, 2, 3)}")
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b
fun maxOf(a: Int, b: Int, c: Int) = maxOf(a, maxOf(b, c))

fun minOf(a: Int, b: Int) = if (a > b) b else a
fun minOf(a: Int, b: Int, c: Int) = minOf(a, minOf(b, c))
