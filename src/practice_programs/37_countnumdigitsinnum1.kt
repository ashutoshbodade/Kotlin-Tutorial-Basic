package practice_programs_dash_tech
//Count Number of Digits in an Integer
fun main() {
    var count = 0
    var num = 54124518

    while (num != 0) {
        num /= 10
        ++count
    }


    println("Number of digits: """$count")
}