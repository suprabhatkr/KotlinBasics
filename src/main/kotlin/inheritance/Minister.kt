package inheritance

// Child Class
class Minister (
    private val post : String,
    private val politicalParty : String,
    startDateString : String,
    override val state: String = "",
    override val constituency: String = ""
)   // Deriving from Base Class
    : Parliamentarian(politicalParty, startDateString),
        // from interfaces
        LowerHouseMember, UpperHouseMember
{

        private var secretery : String = ""

    init {
            this.secretery = "Old One"
        }

        fun setSecretery(secreteryName : String) {
            this.secretery = secreteryName
        }

        override fun showDetails() {
            super<Parliamentarian>.showDetails()
            super<LowerHouseMember>.showDetails()
            super<UpperHouseMember>.showDetails()
            println("Post is ${this.post}")
            println()
        }

        fun showMinistry() {
            println("Ministry is ${this.post}")
        }

}