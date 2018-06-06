fun main(args: Array<String>) {
    var a = 10
    var b = 20

    println(add(a, b))

    sayHello()
}

// 函数体只有一行
//fun add(a:Int, b:Int): Int {
//    return a + b
//}

// 1.省略{} return,并用 = 连接
//fun add(a:Int, b:Int): Int = a + b

// 2.省略返回值类型 Int 最终版
fun add(a:Int, b:Int) = a + b

fun sayHello() = println("hello")



