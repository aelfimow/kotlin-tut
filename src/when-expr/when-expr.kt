fun main(args: Array<String>) {
    for (arg in args) {
        printInfo(arg)
    }
}

fun printInfo(obj: Any): String {
    when (obj) {
        "A" -> println("A wie Autobahn")
        "B" -> println("B wie Blödmann")
        "C" -> println("C wie Chaos")
        "D" -> println("D wie Diphterie")
        "E" -> println("E wie Euphorie")
        "F" -> println("F wie Fussball")
        else -> println("$obj ist unbekannt...")
    }
}
