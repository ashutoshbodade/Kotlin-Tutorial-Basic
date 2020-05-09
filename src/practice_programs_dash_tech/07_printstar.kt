package practice_programs_dash_tech
//Program to print half star * pyramid
fun main() {
    val rows = 5

    for (i in 1..rows) {
        for (j in 1..i) {
            print('*')
        }
        println()
    }
}
