class Dog(val name: String, var weight: Int, breed_param: String) {
    init {
        var activities = arrayOf("Walks")
        val breed = breed_param.toUpperCase()
        println("Dog $name has been created.")
    }
}

fun main() {
    val d = Dog("test", 1, "test")
}