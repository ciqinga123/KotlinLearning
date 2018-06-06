fun main(args: Array<String>) {
    var person4 = Person4("hh",13, "女")
//    person4.sleep()
}

class Person4(var name: String, var age: Int) { // 创建的时候就需要修改里面的name和age
    var sex = ""
    constructor(name: String, age: Int, sex: String):this(name, age) {
        this.sex = sex
        println("次构函数初始化")
    }

    init {
        println("主构函数init")
    }
    fun sleep() {
        println("睡觉")
    }
}