fun main(args: Array<String>) {
    var person2 = Person2("流川枫", 20)
    println(person2.name + person2.age)
}

class Person2(name: String, age: Int) { //创建的时候就需要修改里面的name和age
    var name = ""
    var age = 0

    init { // 初始化
        this.name = name
        this.age = age
    }

    fun sleep() {
        println("睡觉")
    }
}