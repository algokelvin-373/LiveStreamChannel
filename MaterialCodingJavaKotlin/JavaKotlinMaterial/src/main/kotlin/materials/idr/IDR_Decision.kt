package materials.idr

fun main() {
    println("Input number:")
    val number = readLine()?.toInt()

    // Decision Programming
    if (number!! % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
}