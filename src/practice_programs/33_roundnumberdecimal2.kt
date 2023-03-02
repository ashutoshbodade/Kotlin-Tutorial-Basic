package practice_programs_dash_tech
import java.math.RoundingMode
import java.text.DecimalFormat
//Round a Number using DecimalFormat
fun main() {
    val num = 152.34567445606120
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING

    println(df.format(num))

}