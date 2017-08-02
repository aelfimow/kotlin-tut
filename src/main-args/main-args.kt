fun main(args: Array<String>) {
    println("args size: ${args.size}")
    printAll1(args)
    checkNumbers(args)
}

fun printAll1(args: Array<String>) {
    var count = args.size;
    while (count > 0) {
        var tmp_index = args.size - count
        println("args[$tmp_index]: ${args[tmp_index]}")
        --count
    }
}

fun checkNumbers(args: Array<String>) {
    var count = args.size;

    while (count > 0) {
        var tmp_index = args.size - count
        var number = args[tmp_index].toIntOrNull()
        if (number != null) {
            println("args[$tmp_index]: ${args[tmp_index]} is a number $number")
        } else {
            println("args[$tmp_index]: ${args[tmp_index]} is not a number")
        }
        --count
    }
}
