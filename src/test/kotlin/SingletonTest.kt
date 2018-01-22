import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SingletonTest {
    @Test
    fun singletonTest() {
        val result = Singleton.doSth()

        Assertions.assertEquals("someThing", result)
    }
}