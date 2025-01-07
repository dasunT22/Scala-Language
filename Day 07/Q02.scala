object SquareCalculator {
    def calculateSquare(numbers: List[Int]): List[Int] = {
        numbers.map(num => num * num)
    }

    def main(args: Array[String]): Unit = {
        print("Enter numbers separated by commas :")
        val input = scala.io.StdIn.readLine()
        val inputList = input.split(",").map(_.trim.toInt).toList

        val output = calculateSquare(inputList)
        println(s"Squares of the input numbers: $output")
    }
}