import behavioral.Printer
import behavioral.lowerCasePrintStrategy
import behavioral.upperCasePrintStrategy
import org.testng.Assert.*
import org.testng.annotations.Test

class StrategyTests {
    @Test
    fun `StrategyTest lowerCasePrintStrategy`() {
        val printer = Printer(lowerCasePrintStrategy)

        val result = printer.print("LOWER CASE")

        assertEquals("lower case", result)
    }

    @Test
    fun `StrategyTest upperCaseStrategy`() {
        val printer = Printer(upperCasePrintStrategy)

        val result = printer.print("lower case")

        assertEquals("LOWER CASE", result)
    }
}