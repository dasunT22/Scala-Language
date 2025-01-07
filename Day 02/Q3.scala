object Q3 {
    def main(args:Array[String]):Unit={
        val nwhours=40
        val othours=30
        val tax=12
        var temp=finalsalary(nwhours,othours,tax)
        println(temp)
    }

    def totalsalary(nwhours:Double,othours:Double):Double={
        val nwrate=250
        val Otrate=85
        nwhours*nwrate+othours*Otrate
    }

    def finalsalary(nwhours:Double,othours:Double,tax:Double):Double={
        val salary=totalsalary(nwhours:Double,othours:Double)
        val taxamount=salary*tax/100
        salary-taxamount
    }
}
