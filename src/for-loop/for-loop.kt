fun main(args: Array<String>) {
    val myFruits = listOf("Apfel", "Birne", "Banane")
    for (fruit in myFruits) {
        println("fruit is $fruit")
    }
    for (fruit_index in myFruits.indices) {
        println("fruit[$fruit_index] is ${myFruits[fruit_index]}")
    }
    for (arg in args) {
        println("arg is $arg")
    }
    for ((argc, argstr) in args.withIndex()) {
        println("args[$argc] is $argstr")
    }
}
