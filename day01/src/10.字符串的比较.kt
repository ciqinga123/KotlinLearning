fun main(args: Array<String>) {
    val s = "abc"
    var s2 = String(charArrayOf('a','b','c'))

    println(s == s2) // 内部调用equals
    println(s.equals(s2))

    println(s === s2)
}