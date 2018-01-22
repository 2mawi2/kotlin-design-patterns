import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ProxyTests {
    @Test
    fun `original api should return Element with name "default"`() {
        val result = Api().getElementById(1)
        assertNotEquals("default", result)
    }

    @Test
    fun `proxy result and original api result should not be equal`() {
        val result = Api().getElementById(1)
        val proxyResult = ApiProxy().getElementById(1)
        assertNotEquals(result, proxyResult)
    }

    @Test
    fun `getElementById should return modified name`() {
        val result = ApiProxy().getElementById(1)
        assertEquals("getElementById", result.name)
    }

    @Test
    fun `getElementByName should return modified name`() {
        val result = ApiProxy().getElementByName("someName")
        assertEquals("getElementByName", result.name)
    }
}