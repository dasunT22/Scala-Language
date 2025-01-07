import scala.io.StdIn.readLine
object ReverseString {

  def reverseString(s: String): String = s.reverse

  def main(args: Array[String]): Unit = {
    println("Enter a string to reverse:")
  val originalString = readLine()
  
  if (!originalString.isEmpty) {  // Check if string is empty
    val reversedString = reverseString(originalString)
    println(s"Reversed String: $reversedString")
  } else {
    println("Please enter a string to reverse.")
  }
}
}
