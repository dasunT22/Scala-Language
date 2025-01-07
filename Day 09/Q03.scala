object SimpleStringFormatter {

    def toUpper(name: String): String = {
        name.map(char => if (char >= 'a' && char <= 'z') (char - 32).toChar else char)
    }

    def toLower(name: String): String = {
        name.map(char => if (char >= 'A' && char <= 'Z') (char + 32).toChar else char)
    }

    def formatNames(name: String)(formatFunction: String => String): String = {
        formatFunction(name)
    }

    def main(args: Array[String]): Unit = {
    
        val name1 = "Benny"
        val name2 = "Niroshan"
        val name3 = "Saman"
        val name4 = "Kumara"

// BENNY
    println(formatNames(name1)(toUpper))
    
// NIroshan
    println(formatNames(name2)(name => {
    toUpper(name.substring(0, 2)) + toLower(name.substring(2))
    }))

 // saman
    println(formatNames(name3)(toLower))

 // KumarA
    println((formatNames(name4)(name => {
    toUpper(name.substring(0, 1)) + toLower(name.substring(1, 5)) + toUpper(name.substring(5))
    })) )                                             
    }
}
