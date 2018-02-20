import analysis.Scale
import analysis.Temperature
import org.testng.Assert.*
import org.testng.annotations.Test

class QuantityTests {
    @Test
    fun `should init correctly`() {
        val result = Temperature(10.0f, Scale.CELSIUS).amount
        assertEquals(result, 10.0f)
    }

    @Test
    fun `should add Celsius and Fahrenheit`() {
        val result = Temperature(10.0f, Scale.CELSIUS) + Temperature(122.0f, Scale.FAHRENHEIT)
        assertEquals(result.amount, 60.0f)
        assertEquals(result.scale, Scale.CELSIUS)
    }

    @Test
    fun `should substract Celsius from Fahrenheit`() {
        val result = Temperature(10.0f, Scale.CELSIUS) - Temperature(122.0f, Scale.FAHRENHEIT)
        assertEquals(result.amount, -40.0f)
    }

    @Test
    fun `should multiply Celsius by Fahrenheit`() {
        val result = Temperature(10.0f, Scale.CELSIUS) * Temperature(122.0f, Scale.FAHRENHEIT)
        assertEquals(result.amount, 500.0f)
    }

    @Test
    fun `should divide Celsius by Fahrenheit`() {
        val result = Temperature(10.0f, Scale.CELSIUS) / Temperature(122.0f, Scale.FAHRENHEIT)
        assertEquals(result.amount, 10.0f / 50.0f)
    }
}