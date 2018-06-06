fun main(args: Array<String>) {
    val array = arrayOf("张三","李四","张四","王五","张三","赵六")
    //查找第一个”张三”角标
    println(array.indexOf("张三"))
    //查找最后一个”张三”角标
    println(array.lastIndexOf("张三"))
    /*---------------------------- 高阶函数实现 ----------------------------*/
    //查找第一个姓”张”的人的角标
    println(array.indexOfFirst {
        it.startsWith("张")
    })
    //查找最后一个姓”张”的人的角标
    println(array.indexOfLast {
        it.startsWith("张")
    })

    println(array.indexOfLast { it == "张三" })
}