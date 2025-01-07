object Inventory{
    
    def main(args:Array[String]):Unit={
        Names = Array("Shirt", "Pants", "Hat")
        Quantities = Array(10, 5, 2)

        displayInventory()
        restockItem("Shirt", 3)
        sellItem("Pants", 2)
        sellItem("Shoes", 1) 
        displayInventory()
    }

    var Names: Array[String] = Array.empty[String]
    var Quantities: Array[Int] = Array.empty[Int]

    def displayInventory(): Unit = {
        if (Names.isEmpty) {
        println(" Empty Inventory ")
    } else {
        println("Inventory:")
        for (i <- Names.indices) {
        println(s"${Names(i)}: ${Quantities(i)}")
        }
    }
    }
    def restockItem(Name: String, quantity: Int): Unit = {
        val index = Names.indexOf(Name)
        if (index != -1) {
            Quantities(index) += quantity
            println(s"Restocked ${quantity} units of ${Name}.")
        } else {
            println(s"Item '${Name}' not found in inventory.")
        }
    }

    def sellItem(Name: String, quantity: Int): Unit = {
        val index =Names.indexOf(Name)
        if (index != -1) {
            if (Quantities(index) >= quantity) {
                Quantities(index) -= quantity
                println(s"Sold ${quantity} units of ${Name}.")
            } else {
                println(s"Insufficient stock of '${Name}'. Only ${Quantities(index)} units available.")
            }
            } else {
                println(s"Item '${Name}' not found in inventory.")
            }
    }
    

}