package practice_programs_dash_tech
//Reverse a Sentence Using Recursion
fun main() {
    val sentence = "sentenses"
    val reversed = reverse(sentence)
    println("The reversed sentence is: $reversed")
}

fun reverse(sentence: String): String {
    if (sentence.isEmpty())
        return sentence

    return reverse(sentence.substring(1)) + sentence[0]
}