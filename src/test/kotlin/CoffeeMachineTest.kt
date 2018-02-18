import org.testng.annotations.Test

internal class DecoratorTests {

    @Test
    fun makeSmallCoffee() {
        val coffeeMachine = CoffeeMachine()
        val result = coffeeMachine.makeSmallCoffee()
    }

    @Test
    fun makeLargeCoffee() {
    }
}