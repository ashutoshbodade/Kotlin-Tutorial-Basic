package practice_programs_dash_tech
import java.lang.Double.parseDouble
//Check if a string is numeric
Fun main() {

    val string = "1234"
    var numeric = true

    try {
        val num = parseDouble(string)
    }   catch (e: NumberFormatException) {
        numeric = false
    }

    if (numeric)
    println("$string is a number")
    else
    println("$string is not a number")

}
