fun main(args: Array<String>) {
    print("sum2: ")
    println(sum2(1, 2))
    print("sum3: ")
    println(sum3(1, 2, 3))
    println("sum2eb: ${sum2eb(1, 2)}")
    println("sum3eb: ${sum2eb(1, 2, 3)}")
}

fun sum2(a: Int, b: Int): Int {
    return a + b
}

fun sum2eb(a: Int, b: Int) = a + b

fun sum3(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun sum3eb(a: Int, b: Int, c: Int) = a + b + c
