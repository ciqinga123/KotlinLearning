fun main(args: Array<String>) {
    val s = "  中国 "
//    println(s.trim())

    val s2 = """
        /中国
        商丘
        ha
    """.trimIndent()

    println(s2.trimMargin("/"))
}