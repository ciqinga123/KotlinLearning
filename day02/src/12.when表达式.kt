fun main(args: Array<String>) {
    println(doSomething(0))
}

fun doSomething(age:Int):String {
    return when(age) {
        in 1..10 -> {
            "小学"
        }
        11,12,13 -> "初中"
        in 14..18 -> "高中"
        in 19..22 -> "大学"
        else -> "社会"
    }
}