object DiskAreaCalculator {

    def main(args: Array[String]): Unit = {
        val radius = 5
        val area = areaOfDisk(radius)
        println(s"The area of a disk with radius $radius is $area")
    }

    def areaOfDisk(radius: Double): Double = {
        val Pi = math.Pi
        Pi * radius * radius
    }

}
