package com.ciqing.dslclass
/*            person {
                name = "张三"
                age = 10
                address {
                    city = "北京"
                    street = "天通苑北"
                    numer = 007
                }
            }
*/

fun main(args: Array<String>) {
    var person =
            person {
                name = "刺青"
                age = 10
                address {
                    city = "北京"
                    street = "天通苑北"
                    number = 117
                }
            }

    println(person)
}

fun Person.address(block: Address.()-> Unit) {
    var address = Address()
    address.block()
    this.address = address
}

fun person(block:Person.()->Unit):Person {
//    var person = Person()
//    person.block()
//    return person
    return Person().apply(block)
}

data class Person(var name: String? = null, var age:Int? = null, var address: Address? = null)

data class Address(var city:String? = null, var street:String? = null,var number:Int? = null)