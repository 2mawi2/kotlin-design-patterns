package analysis

enum class Scale {
    CELSIUS,
    KELVIN,
    FAHRENHEIT
}

class Temperature(val amount: Float, val scale: Scale) {
    private fun convert(destinationScale: Scale): Temperature {
        val converted = TempConverter.parse(this.scale, destinationScale, amount)
        return Temperature(converted, destinationScale)
    }

    operator fun minus(other: Temperature): Temperature {
        return Temperature(this.amount - other.convert(scale).amount, scale)
    }

    operator fun plus(other: Temperature): Temperature {
        return Temperature(this.amount + other.convert(scale).amount, scale)
    }

    operator fun div(other: Temperature): Temperature {
        return Temperature(this.amount / other.convert(scale).amount, scale)
    }

    operator fun times(other: Temperature): Temperature {
        return Temperature(this.amount * other.convert(scale).amount, scale)
    }
}

object TempConverter {
    fun parse(origin: Scale, dest: Scale, amount: Float) = when (origin) {
        Scale.CELSIUS -> CelsiusConverter.convert(dest, amount)
        Scale.KELVIN -> KelvinConverter.convert(dest, amount)
        Scale.FAHRENHEIT -> FahrenheitConverter.convert(dest, amount)
    }
}

object CelsiusConverter {
    fun convert(dest: Scale, amount: Float) = when (dest) {
        Scale.CELSIUS -> amount
        Scale.KELVIN -> amount + 273.15f
        Scale.FAHRENHEIT -> amount * 9 / 5 + 32
    }
}

object KelvinConverter {
    fun convert(dest: Scale, amount: Float) = when (dest) {
        Scale.CELSIUS -> amount - 273.15f
        Scale.KELVIN -> amount
        Scale.FAHRENHEIT -> amount * 9 / 5 - 459.67f
    }
}

object FahrenheitConverter {
    fun convert(dest: Scale, amount: Float) = when (dest) {
        Scale.CELSIUS -> (amount - 32) * 5 / 9
        Scale.KELVIN -> (amount + 459.67f) * 5 / 9
        Scale.FAHRENHEIT -> amount
    }
}

