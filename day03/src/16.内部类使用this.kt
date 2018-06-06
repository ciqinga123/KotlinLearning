package fff
fun main(args: Array<String>) {
    var innnerClass = OutClass().InnnerClass()
    innnerClass.sayHello()
}

class OutClass{
    var name = "外部张三"
    inner class InnnerClass{
        var name = "内部张三"
        fun sayHello(){
            println("你好${this@OutClass.name}")
        }
    }
}