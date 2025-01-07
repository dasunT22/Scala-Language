object InventoryManagement {

    import scala.io.StdIn.readLine

    def main(args: Array[String]): Unit = {
        val productList = getProductList()
        printProductList(productList)
        val totalProducts = getTotalProducts(productList)
        println(s"Total number of products: $totalProducts")
    }

    def getProductList(): List[String] = {
        var products: List[String] = List.empty[String]
        var input: String = ""
    
        while (input != "done") {
            input = readLine("Enter a product name (Enter 'done' to finish): ")
            if (input != "done") {
                products = products :+ input 
            }
        }

        products
    }

    def printProductList(products: List[String]): Unit = {
        println("List of Products:")
        products.zipWithIndex.foreach { case (product, index) =>
        println(s"${index + 1}. $product")
        }
    }

    def getTotalProducts(products: List[String]): Int = {
        products.length
    }
}
