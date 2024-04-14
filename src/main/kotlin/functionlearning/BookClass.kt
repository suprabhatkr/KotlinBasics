package functionlearning

import java.text.SimpleDateFormat
import java.util.Date

fun main() {
    val sampleBook = Book()
    println("${sampleBook.title} is a book by ${sampleBook.author} published in ${sampleBook.yearPublished}")
    val inputDate = "2020-03-03" // Replace with your desired date input
    val format = SimpleDateFormat("yyyy-MM-dd")
    val customDate = format.parse(inputDate)
    val customBook = Book("Life Lessons", "Suprabhat", customDate)
    println("${customBook.title} is a book by ${customBook.author} published in ${customBook.yearPublished}")
}

class Book(
    val title: String = "Unknown",
    val author: String = "Anonymous",
    val yearPublished: Date = Date()
){
    init {
        println("Book object created")
    }
}