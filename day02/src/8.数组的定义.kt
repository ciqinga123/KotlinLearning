fun main(args: Array<String>) {
    val arrayOf2 = arrayOf("哈哈", "呵呵", "嘻嘻")  // String数组只能通过这种方式创建


    val arrayOf = arrayOf('a', 'b', 'c')
    val  charArray = CharArray(3) {it ->
        'a'
    }
    charArray[1] = 'a'
    for (c in charArray) {
        println(c)
    }

    val arrayOf1 = arrayOf(1, 2, 3)
    println(arrayOf::class.java.name)
}