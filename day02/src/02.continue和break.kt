fun main(args: Array<String>) {
    val str = "abcde"
    for (c in str) {
        if (c == 'b') {
            break
        }
        println(c)
    }

    str.forEach {
        if (it == 'c') {
return
        }
        println(it)
    }
}