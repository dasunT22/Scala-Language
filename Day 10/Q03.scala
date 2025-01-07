object BankApp {

    class Account(var balance: Double) {
    
    // deposit money
    def deposit(amount: Double): Unit = {
        if (amount > 0) {
            balance += amount
            println() //this commands use for to clear my output
            println(f"Deposited Rs.$amount%.2f. New balance: Rs.$balance%.2f")
        } else {
            println()
            println("Deposit amount must be positive.")
        }
    }

    // withdraw money
    def withdraw(amount: Double): Unit = {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println()
            println(f"Withdrew Rs.$amount%.2f. Remaining balance: Rs.$balance%.2f")
        } else {
            println()
            if(amount <0){
                println("Invalid withdrawal amount.")
            }else if(amount > balance){
                println("Insufficient balance.")
            }
        }
    }

    // transfer money
    def transfer(amount: Double, toAccount: Account): Unit = {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount)
            toAccount.deposit(amount)
            println()
            println(f"Transferred Rs.$amount%.2f to another account. Your new balance: Rs.$balance%.2f")
        } else {
            println()
            if(amount <0){
                println("Invalid transfer amount.")
            }else if(amount > balance){
                println("Insufficient balance.")
            }
        }
    }

    }

    def main(args: Array[String]): Unit = {
        print("Enter initial balance in Account A:")
        val balanceA = scala.io.StdIn.readDouble()
        val accountA = new Account(balanceA)

        print("Enter initial balance in Account B:")
        val balanceB = scala.io.StdIn.readDouble()
        val accountB = new Account(balanceB)

        print("Enter amount to transfer from Account A to Account B:")
        val transferAmount = scala.io.StdIn.readDouble()
        accountA.transfer(transferAmount, accountB)

        println()
        println(f"Account A balance: Rs.${accountA.balance}%.2f")
        println()
        println(f"Account B balance: Rs.${accountB.balance}%.2f")
    }
}
