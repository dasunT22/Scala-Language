object NumberCategorizer {
    def main(args: Array[String]): Unit = {
    
        print("Enter an integer: ")
        val num = scala.io.StdIn.readInt()
    
        val isDevideByThree: Int => Boolean = _ % 3 == 0
        val isDevideByFive: Int => Boolean = _ % 5 == 0

        (isDevideByThree(num), isDevideByFive(num)) match {
            case (true, true)   => println("Multiple of Both Three and Five")
            case (true, false)  => println("Multiple of Three")
            case (false, true)  => println("Multiple of Five")
            case (false, false) => println("Not a Multiple of Three or Five")
        }
    }
}