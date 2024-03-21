import kotlin.Array

class ArrayClass {

    fun declaration() {
        println("===Declaration of Array===")
        var cityArray = arrayOf("Bengaluru", "Delhi", "Mumbai")
        println(cityArray.joinToString())

        val numbersArray = arrayOf(1, 2, 3)
        println(numbersArray.joinToString())

        cityArray += "Noida"
        println(cityArray.joinToString())

        val nullArray: Array<Int?> = arrayOfNulls(3)
        println(nullArray.joinToString())

        var emptyArray = emptyArray<String>()
        println(emptyArray.joinToString ())
        emptyArray += "first"
        println(emptyArray.joinToString())

        val initArray = Array(3) {0}
        println(initArray.joinToString())

        val squareArray = Array(5) { i -> i*i}
        println(squareArray.joinToString())

        val nestedArray = Array(2) {Array (3) {0} }
        for (array in nestedArray) {
            println(array.joinToString())
        }
    }

    fun accessing() {
        val newArray = arrayOf(3,4,5)
        println(newArray.joinToString())
        println(String.format("third element = %d", newArray[2]))

        newArray[1] = 6
        println(newArray.joinToString())
    }

    fun methods() {
        println("===methods===")
        val firstArray = arrayOf(1, 2, 3)
        val secondArray = arrayOf(1, 2, 3)
        println("first array = " + firstArray.joinToString() + " second array = " + secondArray.joinToString() + if(firstArray.contentEquals(secondArray)) " Same content" else " Different content")

        secondArray[2] = 4
        println("first array = " + firstArray.joinToString() + " second array = " + secondArray.joinToString() + if(firstArray.contentEquals(secondArray)) " Same content" else " Different content")

        firstArray.shuffle()
        println("Shuffled Array = " + firstArray.joinToString())

        println("Sum for first array = " + firstArray.sum())
    }

    fun convertArray() {
        println("===convert Array to other===")
        val arr = arrayOf(4, 5, 6)
        println("Array as list, set and map")
        println(arr.toList())
        println(arr.toSet())

        val arrMap = arrayOf("one" to 1, "two" to 2, "three" to 3)
        println(arrMap.toMap())
    }
}