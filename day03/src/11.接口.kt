fun main(args: Array<String>) {
    var yao = Yao()
    yao.drive()
    yao.ride()
}

class Yao:DriveCar, RideBike {
    override var brand: String = ""
        get() = ""

    override fun drive() {
        println("开汽车")
    }

    override fun ride() {
        println("骑自行车")
    }

}

interface DriveCar {
    var brand:String
    fun drive()
}

interface RideBike {
    fun ride()
}