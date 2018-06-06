fun main(args: Array<String>) {
    println(kSum(1000000))
}

// kotlin实现
tailrec fun kSum(n:Int, result: Int = 0): Int {
    return if (n == 1) result + 1 else kSum(n-1, result + n)
}