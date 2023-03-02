package practice_programs_dash_tech
//Find Largest Among three numbers
fun main() {

    val n1:Double = -4.5
    val n2:Double = 3.9
    val n3:Float = 2.5 f
    if (n1 >= n2 && n1 >= n3)
        println("$n1 is the largest number.")
    else if (n2 >= n1 && n2 >= n3)
        println("$n2 is the largest number.")
    else
        println("$n3 is the largest number.")
}
