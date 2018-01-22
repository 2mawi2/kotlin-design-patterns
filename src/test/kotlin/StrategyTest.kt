import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StrategyTest {
    @Test
    fun `StrategyTest lowerCasePrintStrategy`() {
        val printer = Printer(lowerCasePrintStrategy)

        val result = printer.print("LOWER CASE")

        Assertions.assertEquals("lower case", result)
    }

    @Test
    fun `StrategyTest upperCaseStrategy`() {
        val printer = Printer(upperCasePrintStrategy)

        val result = printer.print("lower case")

        Assertions.assertEquals("LOWER CASE", result)
    }
}