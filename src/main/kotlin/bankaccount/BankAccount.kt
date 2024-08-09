package bankaccount

// we can declare a class attribute both as parameter or in the parentheses of class
class BankAccount(
    val name: String,
    private var balance: Int
) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Int) {
        balance += amount
        transactionHistory.add("$amount deposited to $name account, ${acctBalance()} is present")
    }

    fun withdraw(amount: Int) {
        if (balance - amount < 0) {
            println("Not enough money in $name account, transaction failed")
        } else {
            balance -= amount
            println("${acctBalance()} left in bank account")
            transactionHistory.add("$amount withdrawn from $name account, ${acctBalance()} is present")
        }
    }

    fun displayTransactionHistory() {
        println("Transaction History :-")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }

    fun acctBalance(): Int {
        return balance
    }
}