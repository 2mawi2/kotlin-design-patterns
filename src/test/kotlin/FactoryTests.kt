import org.testng.Assert.assertTrue
import org.testng.annotations.Test

class FactoryTests {
    @Test
    fun `AbstractFactory returns correct types`() {
        assertTrue(MercedesFactory().create() is Mercedes)
        assertTrue(PeogeotFactory().create() is Peogeot)
        assertTrue(RenaultFactory().create() is Renault)
    }

    @Test
    fun `Factory returns correct types`() {
        val factory = Factory()
        assertTrue(factory.create(Factory.CarType.MERCEDES) is Mercedes)
        assertTrue(factory.create(Factory.CarType.RENAULT) is Renault)
        assertTrue(factory.create(Factory.CarType.PEOGEOT) is Peogeot)
    }
}