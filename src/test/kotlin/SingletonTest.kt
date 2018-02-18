import creational.Singleton
import org.testng.Assert.*
import org.testng.annotations.Test

class SingletonTest {
    @Test
    fun singletonTest() {
        val result = Singleton.doSth()

        assertEquals("someThing", result)
    }
}