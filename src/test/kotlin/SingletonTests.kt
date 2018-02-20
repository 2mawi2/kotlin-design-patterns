import org.testng.Assert.*
import org.testng.annotations.Test

class SingletonTests {
    @Test
    fun singletonTest() {
        val result = Singleton.doSth()

        assertEquals("someThing", result)
    }
}