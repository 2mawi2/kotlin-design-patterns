import org.testng.Assert.*
import org.testng.annotations.Test


internal class AdapterTests {
    @Test
    fun `Adapter should wrap service appropriately`() {
        var adapter: IService = ServiceAdapter()

        var result = adapter.operation()

        assertEquals(result, "this is a complicatedLongOperationWhichShouldBeWrapped")

    }
}