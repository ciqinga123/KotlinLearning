package com.ciqing.dslclass2

/*            person {
                name = "张三"
                age = 10
                addresses {
                    address {
                        city = "北京"
                        street = "天通苑北"
                        numer = 117
                    }

                    address {
                        city = "上海"
                        street = "外滩"
                        numer = 119
                    }
                }
            }
*/
fun main(args: Array<String>) {
    var pe =
    person {
        name = "张三"
        age = 10
        addresses {
            address {
                city = "北京"
                street = "天通苑北"
                number = 117
            }

            address {
                city = "上海"
                street = "外滩"
                number = 119
            }
        }
    }

    println(pe)
}

fun MyList.address(block: AddressBuilder.() -> Unit) {
    var a = AddressBuilder()
    a.block()
    add(a.build())
}

fun PersonBuilder.addresses(block: MyList.() -> Unit) {
    var list = MyList()
    list.block()
    this.myList = list
}

fun person(block: PersonBuilder.()->Unit):Person {
    var p = PersonBuilder()
    p.block()
    return p.build()
}

@MyClass
class MyList:ArrayList<Address>()

data class Person(val name: String?, val age:Int?, val myList: MyList?)

data class Address(val city:String?, val street:String?,val number:Int?)

@MyClass
class PersonBuilder {
    var name: String? = null
    var age:Int? = null
    var myList: MyList? = null

    fun build():Person {
        return Person(name, age, myList)
    }
}

@MyClass
class AddressBuilder {
    var city:String? = null
    var street:String? = null
    var number:Int? = null

    fun build():Address {
        return Address(city, street, number)
    }
}

@DslMarker
annotation class MyClass



