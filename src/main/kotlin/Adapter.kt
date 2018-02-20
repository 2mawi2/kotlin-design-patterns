internal interface IService { // target signature
    fun operation(): String
}

internal class Service { // Service to wrap
    fun complicatedLongOperationWhichShouldBeWrapped(): String {
        return "this is a complicatedLongOperationWhichShouldBeWrapped"
    }
}

class ServiceAdapter : IService { //Wrapper
    private val service = Service()

    override fun operation(): String {
        return service.complicatedLongOperationWhichShouldBeWrapped()
    }
}

