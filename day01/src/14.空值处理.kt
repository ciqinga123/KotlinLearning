fun main(args: Array<String>) {
    var s:String = "abc"
//    var s2:String = null 报错
    var s3: String? = null // 可空类型
//    println(s3!!.length) // 非空类型
//    println(s3?.length)

    val i = s3?.length ?: 0 // Elvis操作符  ?:
    println(i)
}