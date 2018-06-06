fun main(args: Array<String>) {
    // 求和,分别用java和kotlin实现
    println(kotlinSum(1000000))
    println(javaSum(1000000))

}

// kotlin实现
fun kotlinSum(n:Int): Int {
    return if (n == 1) 1 else kotlinSum(n-1) + n
}

// java 实现
fun javaSum(n:Int): Int {
    var result = 0
    var copyN = n

    while (copyN > 0) {
        result += copyN

        copyN--
    }

    return result
}