package structural

interface Temperature {
    var temperature: Double
}

open class CelsiusTemperature(override var temperature: Double) : Temperature

class FahrenheitObjectAdapter(
        private val celsiusTemperature: CelsiusTemperature
) : Temperature {
    override var temperature: Double
        get() = convertCelsiusToFahrenheit(celsiusTemperature.temperature)
        set(temperatureInF) {
            celsiusTemperature.temperature = convertFahrenheitToCelsius(temperatureInF)
        }

    private fun convertFahrenheitToCelsius(f: Double): Double = (f - 32) * 5 / 9
    private fun convertCelsiusToFahrenheit(c: Double): Double = (c * 9 / 5) + 32
}

class FahrenheitClassAdapter(
        celsiusTemperature: CelsiusTemperature
) : CelsiusTemperature(celsiusTemperature.temperature) {

    private var _temperature: Double = celsiusTemperature.temperature
    override var temperature: Double
        get() = convertCelsiusToFahrenheit(_temperature)
        set(temperatureInF) {
            _temperature = convertFahrenheitToCelsius(temperatureInF)
        }

    private fun convertFahrenheitToCelsius(f: Double): Double = (f - 32) * 5 / 9
    private fun convertCelsiusToFahrenheit(c: Double): Double = (c * 9 / 5) + 32
}