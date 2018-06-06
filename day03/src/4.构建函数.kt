fun main(args: Array<String>) {
    var person = Person("流川枫", 20)
//    person.name = "hh"
}

class Person(name: String, age: Int) { //创建的时候就需要修改里面的name和age
    fun sleep() {
        println("睡觉")
    }
}