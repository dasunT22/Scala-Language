object TemperatureConverter {

    def main(args: Array[String]): Unit = {
        val celsiusTemperature = 35.0
        val fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature)
        println(s"$celsiusTemperature°C is equal to $fahrenheitTemperature°F")
    }

    def celsiusToFahrenheit(celsius: Double): Double = {
        celsius * 1.8 + 32
    }

}
