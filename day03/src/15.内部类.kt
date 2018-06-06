fun main(args: Array<String>) {
    // 加inner,为普通内部类, 外部对象.
    var innerClass = OutClass2().InnnerClass()
}

class OutClass2{
    var name = "张三"
    inner class InnnerClass{
        fun sayHello(){
//            println("你好$name")
        }
    }
}