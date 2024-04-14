package functionlearning

fun main() {
    // basic function
    makeCoffee()
    // function with parameter
    print("Put your name : ")
    val name = readln()
    makeCoffee(0, name)
    // function with return
    println(add(3, 4))
    // function with Data class as input
    val coffeeDetails = CoffeeDetails("Suprabhat", 2)
    makeCoffee(coffeeDetails)
}

fun makeCoffee() {
    println("===basic function===")
    println("Buy beans")
    println("Grind beans")
    println("Put water")
    println("Warm the mixture")
    println("Add sugar")
}

fun makeCoffee(sugarCount: Int, name: String) {
    println("===function with parameter===")
    println("$name buy beans")
    println("Grind beans")
    println("Put water")
    println("Warm the mixture")
    println("Add $sugarCount " + (if (sugarCount == 1) "spoon" else if (sugarCount < 1) "no" else "spoons") +" sugar")
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    println("===function with parameter===")
    println("${coffeeDetails.name} buy beans")
    println("Grind beans")
    println("Put water")
    println("Warm the mixture")
    println("Add ${coffeeDetails.sugarCount} " + (if (coffeeDetails.sugarCount == 1) "spoon" else if (coffeeDetails.sugarCount < 1) "no" else "spoons") +" sugar")
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}