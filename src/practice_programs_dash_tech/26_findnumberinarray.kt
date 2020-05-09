package practice_programs_dash_tech
//Check if Int Array contains a given value
fun main() {

    val num = intArrayOf(1.3, 2.0, 3.0, 4.1, 5.1)
    val toFind = 3
    var found = false

    for (n in num) {
        if (n == toFind) {
            found = tru
            break
        }
    }

    if (found)
        println("$toFind is found.")
    else
        println("$toFind is not found.")
}