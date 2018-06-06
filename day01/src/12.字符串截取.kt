fun main(args: Array<String>) {
//    val s = "我爱你中国,中国我爱你,德玛西亚外岁"
//    val substring = s.substring(2..5)
//    val substring = s.substring(2)
//    val substring = s.substring(2, 5)
//    println(substring)

    val path = "/Users/yole/kotlin-book/chapter.adoc"
    println(path.substringAfter("r"))
    println(path.substringAfterLast("r"))
}