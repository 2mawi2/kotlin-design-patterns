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

interface Car {
    fun getType(): String
}

class Mercedes : Car {
    override fun getType(): String = "Mercedes"
}

class Renault : Car {
    override fun getType(): String = "Renault"
}

class Peogeot : Car {
    override fun getType(): String = "Peogeot"
}