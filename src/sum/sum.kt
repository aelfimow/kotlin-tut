fun main(args: Array<String>) {
    print("sum2: ")
    println(sum2(1, 2))
    println("sum2eb: ${sum2eb(1, 2)}")

    print("sum3: ")
    println(sum3(1, 2, 3))
    println("sum3eb: ${sum3eb(1, 2, 3)}")

    print("sum4: ")
    println(sum4(1, 2, 3, 4))
    println("sum4eb: ${sum4eb(1, 2, 3, 4)}")

    printSum2(1, 2)
    printSum3(1, 2, 3)
    printSum4(1, 2, 3, 4)
}

fun sum2(a: Int, b: Int): Int {
    return a + b
}

fun sum2eb(a: Int, b: Int) = a + b

fun sum3(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun sum3eb(a: Int, b: Int, c: Int) = a + b + c

fun sum4(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d
}

fun sum4eb(a: Int, b: Int, c: Int, d: Int) = a + b + c + d

fun printSum2(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum3(a: Int, b: Int, c: Int): Unit {
    println("sum of $a, $b and $c is ${a + b + c}")
}

fun printSum4(a: Int, b: Int, c: Int, d: Int): Unit {
    println("sum of $a, $b, $c and $d is ${a + b + c + d}")
}
