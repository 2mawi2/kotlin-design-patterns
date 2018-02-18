import creational.*
import org.testng.Assert.assertEquals
import org.testng.Assert.assertTrue
import org.testng.annotations.Test

class FactoryTests {
    @Test
    fun abstractFactoryTest() {
        val mercedesFactory = MercedesFactory()

        val result = mercedesFactory.create().getType()
        assertEquals("creational.Mercedes", result)
    }

    @Test
    fun `Factory returns correct types`() {
        val factory = Factory()
        assertTrue(factory.create(Factory.CarType.MERCEDES) is Mercedes)
        assertTrue(factory.create(Factory.CarType.RENAULT) is Renault)
        assertTrue(factory.create(Factory.CarType.PEOGEOT) is Peogeot)
    }
}