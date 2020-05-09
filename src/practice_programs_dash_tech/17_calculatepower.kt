package practice_programs_dash_tech
//Program to calculate power using recursion
fun main() {
    val base = 3
    val powerRaised = 2
    val result = power(base, powerRaised)

    println("$base^$powerRaised = $result")
}

fun power(base: Int, powerRaised: Int): Int {
    if (powerRaised != 0)
        return base * power(base, powerRaised - 1)
    else
        return 1
}