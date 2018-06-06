package com.ciqing.htmlclass

/*
html{
     head{
         title{
             ""
         }
     }
     body{
         div{
         }
     }
 }
 */

fun main(args: Array<String>) {
    var result =
        html {
            head {
                title {
                    "haha"
                }
            }

            body{
                div{
                }
            }
        }

    println(result.toString())
}

fun Body.div(block: Div.() -> Unit) {
    var d = Div()
    d.block()
    setTag(d)
}

fun Html.body(block: Body.() -> Unit) {
    var b = Body()
    b.block()
    setTag(b)
}

fun Head.title(block: Title.() -> Unit) {
    var t = Title()
    t.block()
    setTag(t)
}

fun Html.head(block: Head.() -> Unit) {
    var h = Head()
    h.block()
    setTag(h)
}

fun html(block: Html.()->Unit):Html {
    var h = Html()
    h.block()
    return h
}

class Html:Tag("html")
class Head:Tag("head")
class Body:Tag("body")
class Div:Tag("div")
class Title:Tag("title")

open class Tag(var name:String) {
    var list = arrayListOf<Tag>()
    var stringBuilder = StringBuilder()

    fun setTag(tag: Tag) {
        list.add(tag)
    }

    override fun toString(): String {
        stringBuilder.append("<$name>")

        list.forEach {
            stringBuilder.append(it.toString())
        }

        stringBuilder.append("</$name>")
        return stringBuilder.toString()
    }
}