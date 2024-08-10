package exception

import java.lang.Exception

fun main() {
    var number : Int

    println("Please Enter a number : ")
    // will be tried as general code
    try {
        number = readln().toInt()
    } catch (e : Exception) { // when exception occurs
        number = 0
        println("Error : ${e.message}")
    } finally { // will be always executed
        println("Code is successful")
    }
    println("The number is $number")
}