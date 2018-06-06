fun main(args: Array<String>) {
    var dog:Dog2 = ShepHerdDog()

    if (dog is ShepHerdDog) {
//        (dog as ShepHerdDog).herdShep()
        dog.herdShep()
    }
}

//Dog狗
abstract class Dog2
//牧羊犬
class ShepHerdDog:Dog2(){
    //功能
    fun herdShep(){
        println("牧羊犬放羊")
    }
}
//中华田园犬
class RuralDog:Dog2(){
    //功能
    fun watchDoor(){
        println("中华田园犬看家")
    }
}