fun main(args: Array<String>) {
    var girl = Girl()
    girl.name = "蓝蓝"
    girl.age = 20
    println(girl.name + girl.age)
    girl.sleep()
}

class Girl {
    var name = "青青"
    var age = 10

    fun sleep() {
        println("睡觉")
    }
}