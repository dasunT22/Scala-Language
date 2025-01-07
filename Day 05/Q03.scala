import scala.io.StdIn

object Fibonacci{

def main(args: Array[String]): Unit = {
    print("Enter number(to print fist n Fibonacci numbers ) : ")
    var n:Int = StdIn.readInt()
    println(s"First $n Fibonacci numbers:")
    printFibonacci(n)
}

def printFibonacci(n: Int): Unit = {
    if (n <= 0) {
        println("No Fibonacci numbers to print.")
    } else {
    for (i <- 0 until n) {
        print(fibonacci(i) + " ")
    }
    println() 
    }
}

def fibonacci(n: Int): Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
}

}