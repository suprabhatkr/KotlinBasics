package functionlearning

fun main() {
    // normal class
    val tommy = Dog()
    println("$tommy")
    // class with parameters
    val spike = BigDog("spike")
    println("$spike")
    // class with properties
    val daisy = CuteDog("Daisy", "Beagle")
    println("$daisy")
    println("${daisy.name} is a dog of type ${daisy.breed} with age ${daisy.age}")
}

class Dog {
    init {
        bark()
    }

    private fun bark() {
        println("woof woof")
    }
}

class BigDog(name: String) {
    init {
        bark(name)
    }

    private fun bark(name: String) {
        println("$name woof woof")
    }
}

class CuteDog(val name: String, val breed: String, val age: Int = 0) {
    init {
        bark()
    }

    private fun bark() {
        println("$name woof woof")
    }
}