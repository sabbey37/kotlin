@file:JvmName("DisplayFunctions")

package rsk

// infix functions = no . or ()
// operator = use symbols
fun main(args: Array<String>) {
    val h1 = Header("H1")
    val h2 = Header("H2")

    val h3 = h1 + h2

    println(h3.Name)
}

class Header(var Name: String) {

}

operator infix fun Header.plus(other: Header) : Header {
    return Header(this.Name + other.Name)
}
