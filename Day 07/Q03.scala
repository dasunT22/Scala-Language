object PrimeNumberFilter {
    def isPrime(n: Int): Boolean = {
        if (n <= 1) false
        else if (n == 2) true
        else !(2 until n).exists(i => n % i == 0)
    }

    def filterPrime(numbers: List[Int]): List[Int] = {
        numbers.filter(n => isPrime(n))
    }

    def main(args: Array[String]): Unit = {
        print("Enter numbers separated by commas :")
        val input = scala.io.StdIn.readLine()
        val inputList = input.split(",").map(_.trim.toInt).toList

        val output = filterPrime(inputList)
        println(s"Prime numbers: $output")
    }
}
