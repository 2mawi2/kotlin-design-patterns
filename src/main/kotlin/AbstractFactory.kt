interface CarFactory {
    fun create(): Car
}

class MercedesFactory : CarFactory {
    override fun create(): Car = Mercedes()
}

class PeogeotFactory : CarFactory {
    override fun create(): Car = Peogeot()
}

class RenaultFactory : CarFactory {
    override fun create(): Car = Renault()
}

interface Car
class Mercedes : Car
class Renault : Car
class Peogeot : Car