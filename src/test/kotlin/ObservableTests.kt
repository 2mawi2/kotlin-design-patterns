import org.junit.jupiter.api.Test

class ObservableTests {
    @Test
    fun observableTest() {
        val observable = Observable()
        val observer = Observer()

        observable.register(observer)

        observable.doSth()
    }
}


