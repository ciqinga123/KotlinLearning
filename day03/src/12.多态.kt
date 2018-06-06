fun main(args: Array<String>) {
    var dog:Animal2 = Dog()
    dog.call()
}

//动物
abstract class Animal2 {
    //行为
    open fun call() {
        println("动物叫")
    }
}

//狗
class Dog : Animal2() {
    override fun call() {
        println("狗汪汪叫")
    }
}

//猫
class Cat : Animal2() {
    override fun call() {
        println("猫喵喵叫")
    }

}