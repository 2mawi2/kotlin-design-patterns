package structural

class Element(var name: String = "default")
interface IApi {
    fun getElementById(id: Int): Element
    fun getElementByName(name: String): Element
}

class Api : IApi {
    override fun getElementById(id: Int): Element = Element()
    override fun getElementByName(name: String): Element = Element()
}

interface ILogger {
    fun log(message: String)
}

class Logger : ILogger {
    override fun log(message: String) = print(message)
}

/**
 * "by" delegates all methodCalls from structural.IApi to realApi
 * Use of the proxy can simply be forwarding to the real object, or can provide additional logic.
 * for example caching or logging
 */
class ApiProxy(
        private val realApi: IApi = Api(),
        private val logger: ILogger = Logger()) : IApi by realApi { //Kotlin keyword by

    override fun getElementById(id: Int): Element {
        logger.log("getElementById called")
        val result = realApi.getElementById(id)
        result.name = "getElementById"
        return result
    }

    override fun getElementByName(name: String): Element {
        logger.log("getElementByName called")
        val result = realApi.getElementByName(name)
        result.name = "getElementByName"
        return result
    }
}