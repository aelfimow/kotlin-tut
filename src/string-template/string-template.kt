fun main(args: Array<String>) {
    var str1 = "string 1"
    var str2 = "string 2"

    var str3 = "str1 is $str1 and length is ${str1.length}"
    var str4 = "str2 is $str2 and length is ${str2.length}"

    println(str3)
    println(str4)

    var str5 = "${str3.replace("str", "string")}"
    var str6 = "${str5.replace("is", "was")}"
    println(str5)
    println(str6)

    var raw_str1 = """This is a raw string."""
    println(raw_str1)
    var str7 = "Raw string >$raw_str1< has length ${raw_str1.length}"
    println(str7)

    var raw_str2 = """
        |one,
        |two,
        |three,
        |hallo
        """.trimMargin();

    println("Raw string2 is >${raw_str2}<");
}
