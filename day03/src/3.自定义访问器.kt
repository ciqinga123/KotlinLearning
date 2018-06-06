fun main(args: Array<String>) {
    var girl3 = Girl3()
    girl3.age = 160
    println(girl3.age)
}

class Girl3 {
    var age = 10
        set(value) {
            if (value < 150) {
                field = value
            } else {
                field = 150
            }
        }

    var name = "青青"
        private set

    fun sleep() {
        println("睡觉")
    }
}