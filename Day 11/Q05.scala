object RunningTimeCalculator {
    def main(args: Array[String]): Unit = {
    // Distance and pace for each segment
        val easyPaceDistance1 = 2 // km
        val easyPaceTimePerKm = 8 // minutes per km

        val tempoDistance = 3 // km
        val tempoTimePerKm = 7 // minutes per km

        val easyPaceDistance2 = 2 // km

        // Calculate total running time
        val totalRunningTime = calculateTotalTime(easyPaceDistance1, easyPaceTimePerKm, tempoDistance, tempoTimePerKm, easyPaceDistance2, easyPaceTimePerKm)

        println(s"Total running time: $totalRunningTime minutes")
    }

    def calculateTotalTime(easyDist1: Int, easyPace: Int, tempoDist: Int, tempoPace: Int, easyDist2: Int, easyPaceAgain: Int): Int = {
        val easyPaceTime1 = easyDist1 * easyPace
        val tempoTime = tempoDist * tempoPace
        val easyPaceTime2 = easyDist2 * easyPaceAgain

        easyPaceTime1 + tempoTime + easyPaceTime2
    }
}
