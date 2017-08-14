fun main(args: Array<String>) {
    println("sum = ${sum(1.0, 1.0)}")
    println("sum = ${sum(1.0f, 1.0f)}")
    println("sum = ${sum(1L, 1L)}")
    println("sum = ${sum(1, 1)}")
    printConstants()
    printHex()
    printBin()
    printConversions()
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

fun printConstants() {
    val a = 42
    val b = 0x42
    val c = 0b1010_1111_0000_1100
    val d = 0b1010_1111_0000_1100_1010_1111_0000_1100
    println("a = $a, b = $b, c = $c, d = $d")
}

fun printHex() {
    val a = 0x42
    val b = 0x42_FF
    val c = 0x42_FF_A0_B0
    val d = 0x42FF_A1B1_DEAD_BEEF
    println("a = $a, b = $b, c = $c, d = $d")
}

fun printBin() {
    val a = 0b11110000
    val b = 0b11110000_01011101
    val c = 0b11110000_10101010_00011000
    val d = 0b11110000_11000011_00111100_00001111
    println("a = $a, b = $b, c = $c, d = $d")
}

fun printConversions() {
    val value: Int = 42
    println("value: ${value.toByte()}, ${value.toShort()}, ${value.toLong()}, ${value.toFloat()}, ${value.toDouble()}")
}
