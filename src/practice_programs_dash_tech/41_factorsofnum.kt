package practice_programs_dash_tech
//Factors of a Positive Integer
fun main() {
    val number = 100

    print("Factors of $number are: ")
    for (i in 1..number) {
        if (number % i == 0) {
            print("$i ")
        }
    }
}