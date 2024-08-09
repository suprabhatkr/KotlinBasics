package inheritance

interface UpperHouseMember {

    val state : String

    fun showDetails() {
        if (this.state != "") println("State is ${this.state}")
    }
}