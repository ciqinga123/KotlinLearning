fun main(args: Array<String>) {
    val s = "abcd"
    // for 循环
//    for (c in s) {
//        println(c)
//    }
//
//    for ((index, c) in s.withIndex()) {
//        println("index = $index, c = $c")
//    }

    // foreach 循环
    s.forEach {
        println(it)
    }

    s.forEachIndexed { index, c ->
        println("index = $index, c = $c")
    }
}