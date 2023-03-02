package practice_programs_dash_tech
//Find Frequency of Character
fun main(args: Array<String>) {
    val str:String = "This website is awesome."
    val ch:Char = "i"
    var frequency = 0

    for (i in 0..str.length - 1) {
        if (ch == str[i]) {
            ++frequency
        }
    }


    println("Frequency of $ch = $frequency")
}
