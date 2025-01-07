object Calculate_Interest {

    def main(args: Array[String]): Unit = {
    
        print("Enter your deposit amount: ")
        val deposit = scala.io.StdIn.readDouble()
    
        if(deposit <= 20000 ){
            val x: Double => Double = _*0.02
            print(s"The interest for a deposit of Rs. $deposit is Rs. ")
            print(x(deposit))
        }

        else if(deposit <= 200000){
            val x: Double => Double = _*0.04
            print(s"The interest for a deposit of Rs. $deposit is Rs. ")
            println(x(deposit))
        }

        else if(deposit <= 2000000){
            val x: Double => Double = _*0.035
            print(s"The interest for a deposit of Rs. $deposit is Rs. ")
            println(x(deposit))
        }

        else if(deposit > 2000000){
            val x: Double => Double = _*0.065
            print(s"The interest for a deposit of Rs. $deposit is Rs. ")
            println(x(deposit))
        }
        
        println() // here i use this command for to clear my terminal 
    }
}