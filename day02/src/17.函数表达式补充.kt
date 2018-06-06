fun main(args: Array<String>) {
    // 函数引用
    var p = ::sum
    println(p(10,20))

    println(p.invoke(10, 20))

    // 匿名函数
    var q = {a:Int,b:Int ->
        a + b
    }

    println(q(3, 5))
}

fun sum(a:Int, b:Int) = a + b