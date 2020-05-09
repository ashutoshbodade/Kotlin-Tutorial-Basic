fun main() {

    for (i in 1..10) {

        if (i % 2 == 0) {
            println(i)
        }
    }

    println()

    for (i in 10 downTo 0 step 2) {

        if (i % 2 == 0) {
            println(i)
        }
    }
}
