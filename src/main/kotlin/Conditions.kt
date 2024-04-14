import kotlin.random.Random

class Conditions {

    fun ifElse() {
        println("=== if else condition ===")
        val randomNumber = Random.nextInt(0, 100 + 1)
        if (randomNumber % 3 == 0) {
            println("$randomNumber is divided by 3")
        } else if (randomNumber % 2 == 0) {
            println("$randomNumber is divided by 2")
        } else {
            println("$randomNumber is neither divided by 2 or 3")
        }

        // ternary type statement
        val remainder = if (randomNumber % 3 == 0) 0 else if (randomNumber % 3 == 1) 1 else 2
        println("Dividing $randomNumber by 3 give $remainder as remainder")
    }

    fun whenCondition() {
        println("===when condition===")
        // when is like switch statement, where last expression of the block inside a branch is returned
        val randomNumber = Random.nextInt(0, 100 + 1)
        println(
            when {
                randomNumber % 3 == 1 -> "$randomNumber leaves remainder 1 when divided by 3"
                randomNumber % 3 == 2 -> "$randomNumber leaves remainder 2 when divided by 3"
                else -> {
                    "$randomNumber leaves remainder 1 when divided by 3"
                }
            }
        )

        print("$randomNumber ")
        when(randomNumber) {
            in 1..50 -> println("is less than equal to 50")
            in 51..100 -> println("is between 51 to 100")
            else -> {
                println("is Zero")
            }
        }

        val isOdd = randomNumber % 2
        val nextEven =
            when (isOdd) {
                0 -> randomNumber + 2
                else -> randomNumber + 1
            }
        println("Next even value to $randomNumber is $nextEven")
    }
}