package materials.oop

fun main() {
    //Create variable to data attribute 'data person'
    val name = "Kelvin Tandrio"
    val age = 26

    // Initialize 'DataPerson' to variable 'person'
    val person = DataPerson(name, age)

    println("Name ${person.name} - (${person.age})")
}

data class DataPerson (
    val name: String,
    val age: Int
)