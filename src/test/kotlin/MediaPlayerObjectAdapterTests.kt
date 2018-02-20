import org.testng.Assert.assertNotEquals
import org.testng.annotations.Test

internal class MediaPlayerObjectAdapterTests {
    @Test
    fun `FahrenheitObjectAdapter should parse to fahrenheit`() {
        val celsiusTemperature = CelsiusTemperature(30.0)
        val fahrenheitTemperature = FahrenheitObjectAdapter(celsiusTemperature)
        assertNotEquals(celsiusTemperature.temperature, fahrenheitTemperature.temperature)
    }

    @Test
    fun `FahrenheitClassAdapter should parse to fahrenheit`() {
        val celsiusTemperature = CelsiusTemperature(30.0)
        val fahrenheitTemperature = FahrenheitClassAdapter(celsiusTemperature)
        assertNotEquals(celsiusTemperature.temperature, fahrenheitTemperature.temperature)
    }
}