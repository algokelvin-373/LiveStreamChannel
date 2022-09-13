package materials.idr

fun main() {
    println("Input to n")
    val n = readLine()?.toInt()

    // Repeat Program
    for (x in 1 until n!!+1) {
        print("$x ")
    }
    println()

}