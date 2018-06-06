fun main(args: Array<String>) {
    // 支持区间,多条件判断
    println(doSomething(0))
}

fun doSomethings(age:Int):String {
    return when(age) {
        is Int -> {
            "Int类型"
        }
        in 1..10 -> {
            "小学"
        }
        11,12,13 -> "初中"
        in 14..18 -> "高中"
        in 19..22 -> "大学"
        else -> "社会"
    }
}