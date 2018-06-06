fun main(args: Array<String>) {
    println(fact(5))
    println(feibonaqie(10))
}

// 阶乘  5阶乘  5*4*3*2*1  5*4的阶乘 1的阶乘 1 n的阶乘   n*(n-1)的阶乘
fun fact(n: Int): Int {
    return if (n == 1) 1 else n * fact(n-1)
}

// 斐波那契数列  1 1 2 3 5 8 13 21 34 55
fun feibonaqie(n:Int): Int {
    return when(n) {
        1,2 -> 1
        else -> feibonaqie(n-2) + feibonaqie(n-1)
    }
}