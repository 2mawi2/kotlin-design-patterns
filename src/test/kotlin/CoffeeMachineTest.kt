import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

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