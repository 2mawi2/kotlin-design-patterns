import org.testng.annotations.Test
import structural.CoffeeMachine

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