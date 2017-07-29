fun main(args: Array<String>) {
    print_german();
    print_english();
}

fun german_str(): String = "Hallo, Welt!"
fun english_str(): String = "Hallo, Welt!"

fun print_german() {
    println(german_str())
}

fun print_english() {
    println(english_str())
}
