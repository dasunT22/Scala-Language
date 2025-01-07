object EvenNumberFilter {
    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
        numbers.filter(num => num % 2 == 0)
    }

    def main(args: Array[String]): Unit = {
        print("Enter numbers separated by commas: ")
        val input = scala.io.StdIn.readLine()
        val inputList = input.split(",").map(_.trim.toInt).toList

        val output = filterEvenNumbers(inputList)
        println(s"Even numbers: $output")
    }
}
