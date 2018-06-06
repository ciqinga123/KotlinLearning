fun main(args: Array<String>) {
    var person3 = Person3("德玛", 18)
//    person3.name = "hh"
    person3.age = 2
}

class Person3(val name: String,var age: Int) { // 创建的时候就需要修改里面的name和age
    fun sleep() {
        println("睡觉")
    }
}