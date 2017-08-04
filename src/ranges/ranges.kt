fun main(args: Array<String>) {
    for (arg in args) {
        Int value = arg.toIntOrNull()
        if (value != null) {
            checkRange(value)
        }
    }
}

fun checkRange(value: Int) {
    if (value in 2 .. 16) {
        println("$value is in range")
    }
    else {
        println("$value is not in range")
    }
}
