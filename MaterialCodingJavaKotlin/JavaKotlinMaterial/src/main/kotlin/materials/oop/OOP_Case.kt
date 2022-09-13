package materials.oop

fun main() {
    // Define object class "Person"
    val person = Person()

    // Call function with object 'person'
    person.setPerson("Kelvin H Tandrio", "Jakarta", 26)

    // Call attribute to get data
    println("Name     : ${person.name}")
    println("Domicile : ${person.domicile}")
    println("Age      : ${person.age}")

}

class Person {
    var name = ""
    var domicile = ""
    var age = 0

    fun setPerson(name: String, domicile: String, age: Int) {
        this.name = name
        this.domicile = domicile
        this.age = age
    }

}