fun main(args: Array<String>) {
    val girl = Girl2()
    girl.name = "蓝蓝"
//    girl.age = 17
}

class Girl2 {
    var name = "青青"

    var age = 10
    private set

    fun sleep() {
        println("睡觉")
    }
}