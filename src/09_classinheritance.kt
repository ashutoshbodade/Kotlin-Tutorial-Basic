fun main() {

    var fish = Fish()
    fish.bread = "abc"
    fish.color = "black"
    fish.swim()
    fish.eat()

    var tgr = Tiger()
    tgr.age = 20
    tgr.color = "brown"
    tgr.run()
    tgr.eat()

    var animal = Animal()
    animal.color = "white"
    animal.eat()
}

open class Animal {         // Super class / Parent class /  Base class

    var color: String = ""

    fun eat() {
        println("Eat")
    }
}

class Fish : Animal() {      // Sub class / Child class / Derived class

    var bread: String = ""

    fun swim() {
        println("swimming")
    }
}

class Tiger : Animal() {      // Sub class / Child class / Derived class

    var age: Int = -1

    fun run() {
        println("run fast")
    }
}