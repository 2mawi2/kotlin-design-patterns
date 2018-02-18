package behavioral

val lowerCasePrintStrategy = { it: String -> it.toLowerCase() }
val upperCasePrintStrategy = { it: String -> it.toUpperCase() }

class Printer(private val strategy: (String) -> String) {
    fun print(s: String): String = strategy(s)
}