fun main(args: Array<String>) {
    var range = 1L..100L

    val downTo = 'z'.downTo('a')
//    downTo.forEach() {
//        println(it)
//    }

    val reversed = range.reversed()
//    reversed.forEachIndexed({
//        index, l ->
//        println("索引$index, 值是$l")
//    })

    for (l in reversed step 10) {
        println(l)
    }
}