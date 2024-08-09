package inheritance


fun main() {
    val vivan = Parliamentarian("ABC", "2024-05-01")
    val kavya = Minister("Health Ministry", "XYZ", "2024-05-01",
        constituency = "MiddleCity")
    val kushal = Minister("Food Ministry", "XYZ", "2022-07-20",
        state = "EastState")

    kavya.setSecretery("Mr. Ajay")

    vivan.showDetails()
    kavya.showDetails()
    kushal.showDetails()

    // specific methods
    vivan.showPoliticalParty()
    kavya.showMinistry()
}
