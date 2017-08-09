fun main(args: Array<String>) {
    when {
        "Obst" in args -> collection_obst()
        "Bauteile" in args -> collection_bauteile()
    }
}

fun collection_obst() {
    val obst = setOf("Apfel", "Birne", "Kiwi", "Banane")
    when {
        "Tomate" !in obst -> println("Tomate ist nicht da")
        "Birne" in obst -> println("Birne ist da")
    }
}

fun collection_bauteile() {
    val bauteile = setOf("Widerstand", "Transistor", "Kondensator", "Spule")
    when {
        "Widerstand" in bauteile -> println("Widerstand ist da")
        "Transistor" in bauteile -> println("Transistor ist da")
        "IC" !in bauteile -> println("IC fehlt!")
    }
}
