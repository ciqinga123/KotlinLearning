fun main(args: Array<String>) {
    var pair = Pair(10, 20)

    println(pair)

    var s = "132"
    val pair1 = s to "22" // 内部调用Pair()构造方法
    println(pair1)

    var t = Triple(1,"2",'h') // 三元元组
    println(t.toList())
}