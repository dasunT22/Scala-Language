object BookWholesaleCostCalculator {
    def main(args: Array[String]): Unit = {
        val coverPrice = 24.95
        val discount = 0.4
        val shippingFirst50 = 3.0
        val shippingAdditional = 0.75
        val totalCopies = 60

        val totalCost = calculateTotalWholesaleCost(coverPrice, discount, shippingFirst50, shippingAdditional, totalCopies)
        println(f"Total wholesale cost for $totalCopies%d copies: Rs. $totalCost%.2f")
    }

    def calculateTotalWholesaleCost(coverPrice: Double, discount: Double, shippingFirst50: Double, shippingAdditional: Double, totalCopies: Int): Double = {
        val discountedPrice = coverPrice * (1 - discount)
        val totalBookCost = discountedPrice * totalCopies

        val totalShippingCost = if (totalCopies <= 50) {
        shippingFirst50
        } else {
        shippingFirst50 + (totalCopies - 50) * shippingAdditional
    }

    totalBookCost + totalShippingCost
    }
}
