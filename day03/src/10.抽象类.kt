fun main(args: Array<String>) {
    var chinese = Chinese()
    println((chinese.color + chinese.language))
    chinese.food()

}

open class Chinese:HuMan() {
    override fun food() {
        println("用筷子")
    }

     override var color = "黑色"
     override var language = "中文"

}

abstract class HuMan {
    open var color:String = ""
    open var language:String = ""

    abstract fun food()
}