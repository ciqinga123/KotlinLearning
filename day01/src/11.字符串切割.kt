fun main(args: Array<String>) {
    val s = "a.b.c.de-f,h-ij"

//    val split = s.split(".")

    // 多条件切割
    val split = s.split(".", "-")

    println(split)
}