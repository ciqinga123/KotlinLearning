fun main(args: Array<String>) {
//    var man = Man()
//
//    println(man.name + man.age)
//
//    man.name = "hh"
//    man.age = 34

    var bird = Bird()
//    bird.color = "white"
    println(bird.color)
    bird.food()
}

//class Man:Human("小头爸爸")
//open class Human(var name: String)

class Bird: Animal(){
    override var color = "orange"

    override fun food() {
        super.food()
        println("吃粮食")
    }
}
open class Animal {
    open var color = "black"

    open fun food() {
        println("动物吃东西")
    }
}