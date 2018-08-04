package rsk

class Person {
    var firstName:String = ""
    var lastName:String = ""

    fun getName(): String = "$firstName $lastName"
}

class Student: Person() {
    
}