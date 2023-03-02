package practice_programs_dash_tech
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale
//Convert String to Date using pattern formatters
fun main() {
    val string = "July 25, 2017"

    val formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH)
    val date = LocalDate.parse(string, formatter)

    println(date)
}

