class Factory {
    enum class CarType {
        MERCEDES,
        RENAULT,
        PEOGEOT
    }

    fun create(type: CarType): Car = when (type) {
        CarType.MERCEDES -> Mercedes()
        CarType.RENAULT -> Renault()
        CarType.PEOGEOT -> Peogeot()
    }
}
