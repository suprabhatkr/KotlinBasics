package inheritance

interface LowerHouseMember {

    val constituency : String

    fun showDetails() {
        if (this.constituency != "") println("Constituency is ${this.constituency}")
    }
}