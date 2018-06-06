fun main(args: Array<String>) {
    // 嵌套类默认是静态内部类,外部类名.
    var innnerClass = OutClass.InnnerClass()
}

class OutClass{
    var name = "张三"
    class InnnerClass{
        fun sayHello(){
//            println("你好$name")
        }
    }
}