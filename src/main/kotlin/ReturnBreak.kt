import kotlin.random.Random

class ReturnBreak {

    fun breakUses() {
        println("===break===")
        val randomNumber = Random.nextInt(1,25)
        println("break without label")
        for (i:Int in 1..5) {
            for (j:Int in 1..5) {
                if (i * j == randomNumber) {
                    println("The i is $i, j is $j and number is $randomNumber")
                    break
                }
            }
        }
        println("break with label")
        firstLoop@ for (i:Int in 1..5) {
            for (j:Int in 1..5) {
                if (i * j == randomNumber) {
                    println("The i is $i, j is $j and number is $randomNumber")
                    break@firstLoop
                }
            }
        }
    }

    fun returnUses() {
        println("===return uses===")
        fun returnWithoutLabel() {
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) {
                    println(it)
                    return
                }
            }
            println("out of loop")
        }
        fun returnWithLabel() {
            listOf(1, 2, 3, 4, 5).forEach returnLabel@{
                if (it == 3) {
                    println(it)
                    return@returnLabel
                }
            }
            println("out of loop")
        }
        fun returnWithImplicitLabel() {
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) {
                    println(it)
                    return@forEach
                }
            }
            println("out of loop")
        }
        returnWithoutLabel()
        returnWithLabel()
        returnWithImplicitLabel()
    }
}