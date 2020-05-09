package practice_programs_dash_tech
//Display Lowercased a to z
fun main(args: Array<String>) {
    var c: Char

    c = "a"
    while (c <= "z") {
        print("$c ")
        ++c
    }
}