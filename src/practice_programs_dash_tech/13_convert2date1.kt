package practice_programs_dash_tech
import java.time.LocalDate
import java.time.format.DateTimeFormatter
//Convert String to Date using predefined formatters
fun main() {
    // Format y-M-d or yyyy-MM-d
    val string = "2017-07-25"
    val date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE)

    println(date)
}
