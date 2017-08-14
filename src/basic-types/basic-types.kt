fun main(args: Array<String>) {
    println("sum = ${sum(1.0, 1.0)}")
    println("sum = ${sum(1.0f, 1.0f)}")
    println("sum = ${sum(1L, 1L)}")
    println("sum = ${sum(1, 1)}")
}

fun sum(a: Double, b: Double): Double {
    println("sum of Doubles")
    return a + b
}

fun sum(a: Float, b: Float): Float {
    println("sum of Floats")
    return a + b
}

fun sum(a: Long, b: Long): Long {
    println("sum of Longs")
    return a + b
}

fun sum(a: Int, b: Int): Int {
    println("sum of Ints")
    return a + b
}

fun sum(a: Short, b: Short): Short {
    println("sum of Shorts")
    return a + b
}

fun sum(a: Byte, b: Byte): Byte {
    println("sum of Bytes")
    return a + b
}
