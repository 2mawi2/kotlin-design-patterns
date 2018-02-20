class Element(var name: String = "default")

interface IApi {
    fun getElementById(id: Int): Element
    fun getElementByName(name: String): Element
}

class Api : IApi {
    override fun getElementById(id: Int): Element = Element()
    override fun getElementByName(name: String): Element = Element()
}

class ApiProxy : IApi {
    private val realApi: IApi = Api() // type instantiated at runtime

    override fun getElementById(id: Int): Element {
        println("getElementById called")
        val result = realApi.getElementById(id)
        result.name = "getElementById"
        return result
    }

    override fun getElementByName(name: String): Element {
        println("getElementByName called")
        val result = realApi.getElementByName(name)
        result.name = "getElementByName"
        return result
    }
}