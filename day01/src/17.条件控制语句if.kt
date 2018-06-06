import jdk.nashorn.internal.ir.Block

fun main(args: Array<String>) {
    // 求2个数中的最大值
    var a = 10
    var m = 20
    var n = 1

    var result = getMaxV(a, {
        20,1 ->
        return 20 + 1
    })


    var result1 = plus()
}

fun getMaxV(a: Int, block: (Int, Int) -> Int): Int {
    var b = block(20,1)
    return if(a > b) a else b
}

fun plus(m:Int, n:Int): Int {
    return m + n
}
