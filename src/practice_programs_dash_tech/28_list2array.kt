package practice_programs_dash_tech
//Convert array list to array
fun main(args: Array<String>) {

    // an arraylist of vowels
    val vowels_list: List<String> = listOf("a", "e", "i", "o", "u")

    // converting arraylist to array
    val vowels_array: Array<String> = vowels_list.toTypedArray()

    // printing elements of the array
    vowels_array.forEach { System.out.print(it) }
}