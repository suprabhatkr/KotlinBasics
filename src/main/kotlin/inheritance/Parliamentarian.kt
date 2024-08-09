package inheritance

// Base Class
open class Parliamentarian(private var politicalParty: String, startDateString: String) {

    private var startDate = Date("1900", "01", "01")
    init {
        val year = startDateString.split("-")[0]
        val month = startDateString.split("-")[1]
        val date = startDateString.split("-")[2]
        startDate = Date(year, month, date)
    }

    // if it is not open then it is final and cannot be overriden
    open fun showDetails() {
        println("Political Party is ${this.politicalParty}")
        println("Start Date is ${this.startDate}")
    }

    fun showPoliticalParty() {
        println("Constituency is ${this.politicalParty}")
    }

}