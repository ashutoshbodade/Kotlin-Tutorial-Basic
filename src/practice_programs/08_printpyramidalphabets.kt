package practice_programs_dash_tech
//Program to print half pyramid using alphabets
fun main() {
    val last = 'J'
    var alphabet = "A"

    for (i in 1..last - 'A' + 1) {
        for (j in 1. .i) {
            print("$alphabet ")
        }
        ++alphabet

        println()
    }

}
