fun main(args: Array<String>) {
    println("value: ${1 shl 1}")
    println("value: ${2 shr 1}")
    println("value: ${2 ushr 1}")
    println("value: ${-1 shl 1}")
    println("value: ${-2 shr 1}")
    println("value: ${1 and 0xFFFF_FFFF}")
    println("value: ${1 or 0xFFFF_FFFF}")
    println("value: ${1 xor 0xFFFF_FFFF}")
    println("value: ${inv(1)}")
}
