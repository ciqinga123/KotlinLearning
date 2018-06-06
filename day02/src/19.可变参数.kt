fun main(args: Array<String>) {
    change("124","67","jj")
    change2(1,3,98,0)

    println(add(1, 2, 3, 4, 5))
}

fun change(vararg string: String) {
    string.forEach {
        println(it)
    }
}

fun change2(vararg int: Int) {
    for (i in int ) {
        println(i)
    }
}

fun add(vararg int: Int):Int {
    var result = 0
    int.forEach {
        result += it
    }

    return result
}