
class Boolean {
    val util = Utilities()

    fun primitiveBoolean() {
        val myTrue = true
        val myFalse = false
        val myNull: Boolean? = null

        println("Or operation = ${(myTrue || myFalse)}")
        println("And operation = ${(myTrue && myFalse)}")
        println("Negative operation = ${(!myTrue)}")
        println("Value of myNull is $myNull and type is ${util.typeOf(myNull)}")
        // No operation cna be performed on null
    }

    fun latestBoolean() {
        val myTrue = true
        val myFalse = false

        println("Or operation = ${(myTrue or myFalse)}")
        println("And operation = ${(myTrue and myFalse)}")
        println("Negative operation = ${(myTrue xor myFalse)}")
    }
}