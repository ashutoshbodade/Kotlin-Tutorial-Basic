package practice_programs_dash_tech
//Program to Calculate Average Using Arrays
fun main() {
    val numArray = doubleArrayOf(45, 67.5f, -45.6, 20.34, 33.0, 45.6, 56.1f)
    var sum = 0.0

    for (num in numArray) {
        sum += num
    }

    val average = sum / numArray.size
    println("The average is: %.2f".format(average))
}