object NumberAnalyzer {

  def main(args: Array[String]): Unit = {
    var continue = true
    while (continue) {
      println("Enter an integer:")
      val inputString = scala.io.StdIn.readLine()

      try {
        val input = inputString.toInt
        
        input match {
          case x if x <= 0 => println("Negative/Zero is input")
          case x if x % 2 == 0 => println("Even number is given")
          case _ => println("Odd number is given")
        }
        continue = false 
      } catch {
        case e: NumberFormatException => 
          println("Invalid input. Please enter an integer.")
      }
    }
  }
}
