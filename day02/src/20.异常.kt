import java.io.File

fun main(args: Array<String>) {
    var a = 10
    var b = 0

    try {
        a / b
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("最终要执行的代码")
    }

    // 编译时异常
    val file = File("hello.txt")
    
}