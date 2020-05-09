package practice_programs_dash_tech
//Check if String with spaces is Empty or Null
fun main(args: Array<String>) {

    val str1: String? = null
    val str2 = ""

    if (isNullOrEmptyy(str1))
        println("str1 is null or empty.")
    else
        println("str1 is not null or empty.")

    if (isNullOrEmptyy(str2))
        println("str2 is null or empty.")
    else
        println("str2 is not null or empty.")

}

fun isNullOrEmptyy(str: String?): Boolean {
    if (str != null && !str.trim().isEmpty())
        return false
    return true
}