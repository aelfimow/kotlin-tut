fun main(args: Array<String>) {
    for (arg in args) {
        val value = arg.toIntOrNull()
        if (value != null) {
            checkRange(value)
        }
    }

    for (x in 1 .. 10) {
        print("$x,")
    }
    println()

    for (x in 1 .. 10 step 2) {
        print("$x,")
    }
    println()

    for (x in 10 downTo 1) {
        print("$x,")
    }
    println()

    for (x in 10 downTo 1 step 2) {
        print("$x,")
    }
    println()
}

fun checkRange(value: Int) {
    if (value in 2 .. 16) {
        println("$value is in range")
    }
    else {
        println("$value is not in range")
    }
}
