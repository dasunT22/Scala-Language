object NumberSelection {

    val selection: Int => String = num =>num match {
            case n if num <= 0 => "Negative/Zero is input"
            case n if num % 2 == 0 => "Even number is given"
            case n if num % 2 != 0 => "Odd number is given"
        }

    def main(args: Array[String]): Unit = {
    
        print("Enter an integer: ")
        val num = scala.io.StdIn.readInt()

        println(selection(num))

    }
}