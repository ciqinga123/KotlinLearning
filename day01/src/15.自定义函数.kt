fun main(args: Array<String>) {
    //    sayHello()
    fun sayHello() {
        println("嵌套函数")
    }

    sayHello()

    println(getName())
}

fun sayHello() {
    println("hello")
}

// 顶层函数
fun getName():String {
   return "ciqing"
}