import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MediaPlayerObjectAdapterTest {
    @Test
    fun `FahrenheitObjectAdapter should parse to fahrenheit`() {
        val celsiusTemperature = CelsiusTemperature(30.0)
        val fahrenheitTemperature = FahrenheitObjectAdapter(celsiusTemperature)
        Assertions.assertNotEquals(celsiusTemperature.temperature, fahrenheitTemperature.temperature)
    }

    @Test
    fun `FahrenheitClassAdapter should parse to fahrenheit`() {
        val celsiusTemperature = CelsiusTemperature(30.0)
        val fahrenheitTemperature = FahrenheitClassAdapter(celsiusTemperature)
        Assertions.assertNotEquals(celsiusTemperature.temperature, fahrenheitTemperature.temperature)
    }
}