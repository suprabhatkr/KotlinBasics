package suprabhatkumar
fun printMessage() {
    println("===Packages===")
    println("Hello World!")
}

class Message {
    companion object {
        fun printMessage() {
            println("Hello new World!")
        }
    }
}