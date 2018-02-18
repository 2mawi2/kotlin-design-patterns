package structural

enum class CoffeeType { LARGE, SMALL }
class Coffee(var milk: Boolean = false, var type: CoffeeType)

interface ICoffeeMachine {
    fun makeSmallCoffee(): Coffee
    fun makeLargeCoffee(): Coffee
}

class CoffeeMachine : ICoffeeMachine {
    override fun makeSmallCoffee() = Coffee(type = CoffeeType.SMALL)
    override fun makeLargeCoffee() = Coffee(type = CoffeeType.LARGE)
}

