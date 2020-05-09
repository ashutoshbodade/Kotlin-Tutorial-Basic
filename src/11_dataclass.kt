fun main(){
    val person1=persons("john",23)
    val person2=persons("john",23)
    if(person1==person2)
    {
        println("equal")
    }
    else
    {
        println("Not equal")
    }
}

data class persons(var name:String, var age:Int){}