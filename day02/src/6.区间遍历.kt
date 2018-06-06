fun main(args: Array<String>) {
    var range = 'a'..'z'

    for (i in range) {
        println(i)
    }

    for ((index, i) in range.withIndex()) {
        println("索引$index, 值是$i")
    }

    range.forEach {
        println(it)
    }

    range.forEachIndexed(){ index, i ->
        println("索引$index, 值是$i")
    }
}