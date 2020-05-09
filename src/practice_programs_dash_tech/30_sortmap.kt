package practice_programs_dash_tech
//Sort a map by values
fun main() {

    var capitals = hashMapOf<String, String>()
    capitals.put("Nepal", "Kathmandu")
    capitals.put("India", "New Delhi")
    capitals.put("United States", "Washington")
    capitals.put("England", "London")
    capitals.put("Australia", "Canberra")

    val result = capitals.toList().sortedBy { (_, value) -> value}.toMap()

    for (entry in result) {
        print("Key: " + entry.key)
        println(" Value: " + entry.value)
    }

}