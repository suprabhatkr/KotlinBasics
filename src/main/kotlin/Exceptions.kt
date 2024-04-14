import java.lang.IllegalArgumentException
import java.time.LocalDate
import kotlin.random.Random

class RandomNumberMatches(errorMsg: String?) : Exception(errorMsg ?: "number matches the random number")

class Person {
    var name: String? = null
}

class Exceptions {
    private fun sendException(x: Int) : Int {
        val randomNumber = Random.nextInt(0, 10)
        if (x == randomNumber) {
            // exception contains string output, stack trace and optional values
            throw RandomNumberMatches("both random number matches")
        } else {
            return x/randomNumber
        }
    }

    fun catchException(){
        println("=== catch the exception ===")
        val randomNumber = Random.nextInt(0, 10)
        try {
            println(sendException(randomNumber))
        } catch (e: RandomNumberMatches) {  // exception type mentioned explicitly
            println(e.message)
        }catch (e: Exception) {  // for any random exception that hasn't been mentioned earlier
            println(e.message)
        } finally {
            println("try catch with exception tested")
        }
    }

    private fun nothingType(msg: String) {
        throw IllegalArgumentException(msg)
    }

    fun nothingArgument() {
        println("===nothing type tested===")
        val person = Person()
        val msg = "No name Provided" + LocalDate.now()
        try {
            val s = person.name ?: nothingType(msg)
            println(s)
        } catch (e: IllegalArgumentException) {
            println(e.message)
        } finally {
            println("Nothing type argument exception tested")
        }

    }
}