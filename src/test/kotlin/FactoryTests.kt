import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class FactoryTests {
    @Test
    fun abstractFactoryTest() {
        val mercedesFactory = MercedesFactory()

        val result = mercedesFactory.create().getType()
        assertEquals("Mercedes", result)
    }
}