package bankaccount

fun main() {
    val bankAccount = BankAccount("Suprabhat", 1200)

    bankAccount.deposit(300)
    bankAccount.withdraw(200)
    bankAccount.deposit(100)
    bankAccount.withdraw(3000)
    bankAccount.withdraw(300)

    bankAccount.displayTransactionHistory()

    val bankAccount2 = BankAccount("Sarah", 0)

    bankAccount2.deposit(100)
    bankAccount2.withdraw(10)
    bankAccount2.deposit(300)

    bankAccount2.displayTransactionHistory()
    println("Remaining balance is = ${bankAccount2.acctBalance()}")
}