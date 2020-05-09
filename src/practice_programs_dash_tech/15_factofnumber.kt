package practice_programs_dash_tech
//Factorial of a Number Using Recursion
fun main() {
    val num = 6.0
    val factorial = multiplyNumbers(num)
    println("Factorial of $num = $factorial")
}

fun multiplyNumbers(num: Int): Long {
    if (num >= 1)
        return num * multiplyNumbers(num - 1)
    else
        return 1
}
