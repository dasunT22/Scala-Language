class Account(val id: Int, var balance: Double) {

    def deposit(amount: Double): Unit = {
        balance += amount
    }

    def withdraw(amount: Double): Unit = {
        balance += amount
    }

    override def toString: String = s"Account($id, Balance: $balance)"
}

object Bank {

    def accountsWithNegativeBalance(accounts: List[Account]): List[Account] = {
        accounts.filter(_.balance < 0)
    }

    def totalBalance(accounts: List[Account]): Double = {
        accounts.map(_.balance).sum
    }

    def applyInterest(accounts: List[Account]): List[Account] = {
        accounts.map { account =>
        if (account.balance > 0) {
            account.deposit(account.balance * 0.05)
        } else {
            account.withdraw(account.balance * 0.1)
        }
        account
        }
    }
}

def main(args: Array[String]): Unit = {

    val accounts = List(
        new Account(1, 1000.0),
        new Account(2, -1000.0),
        new Account(3, 200.0),
        new Account(4, -400.0),
        new Account(5, 3000.0)
    )

    val negativeBalanceAccounts = Bank.accountsWithNegativeBalance(accounts)
    println("Accounts with negative balances:")
    negativeBalanceAccounts.foreach(println)

    val total = Bank.totalBalance(accounts)
    println()
    println(s"Total balance: $total")

    val finalBalances = Bank.applyInterest(accounts)
    println()
    println("Final account balances after applying interest:")
    finalBalances.foreach(println)
}