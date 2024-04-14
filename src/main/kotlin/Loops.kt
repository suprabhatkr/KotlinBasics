import kotlin.random.Random

class Loops {
    private val greetings = arrayOf("Hi", "Hello", "Hola", "Good Morning", "Hey")

    fun forLoop() {
        println("===for loops===")

        for (greeting in greetings) {
            print(greeting + "\t")
        }
        print("\n")

        val n = greetings.size
        for (i in 0..< n) {
            print(greetings[i] + "\t")
        }
        print("\n")

        for (i in greetings.indices) {
            print(greetings[i] + "\t")
        }
        print("\n")

        for (i in greetings.withIndex()) {
            println(i.index.toString() + " : " + i.value)
        }
    }

    fun whileLoop() {
        println("===while loop===")
        var x = Random.nextInt(0, 10)
        println("x is $x")
        while (x < 5) {
            print(x.toString() + "\t")
            x+=1
        }
        print("\n")

        x = Random.nextInt(0, 10)
        println("x is $x")
        do {
            print(x.toString() + "\t")
            x+=1
        } while (x < 5)
        print("\n")
    }

}