import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FactoryTests {
    @Test
    fun abstractFactoryTest() {
        val mercedesFactory = MercedesFactory()

        val result = mercedesFactory.create().getType()

        Assertions.assertEquals("Mercedes", result)
    }
}