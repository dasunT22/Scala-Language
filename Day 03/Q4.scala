object EvenNumberSummator extends App {

  def main(list: List[Int]): Int = {
    var sum = 0
    var isEven = false  // Flag to track even number sequence

    for (num <- list) {
      if (!isEven && num % 2 == 0) {
        sum += num
        isEven = true
      } else if (isEven && num % 2 != 0) {
        isEven = false
      } else if (isEven && num % 2 == 0) {
        sum += num
      }
    }
    sum
  }

  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8)
  val evenSum = main(numbers)

  println(s"Sum of even numbers in $numbers: $evenSum")
}
