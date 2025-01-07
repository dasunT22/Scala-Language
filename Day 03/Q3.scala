object MeanCalculator extends App{

  def main(num1: Int, num2: Int): Double = {
  val divisor = 100.0 // Define divisor for scaling by 100
  val scaledSum = (num1.toDouble * divisor + num2.toDouble * divisor) / 2.0
  scaledSum / divisor
}


  val number1 = 20
  val number2 = 40
  val mean = main(number1, number2)

  println(s"Mean of $number1 and $number2: $mean")
}
