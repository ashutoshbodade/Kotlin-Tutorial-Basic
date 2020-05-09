package practice_programs_dash_tech
import java.util.ArrayList
// Join Two Lists using addAll()
fun main() {

    val list1 = ArrayList<String>()
    list1.add("a")
    list1.add("b")

    val list2 = ArrayList<String>()
    list2.add('c')

    val joined = ArrayList<String>()

    joined.addAll(list1)
    joined.addAll(list2)

    println("list1: $list1")
    println("list2: $list2")
    println("joined: $joined")

}