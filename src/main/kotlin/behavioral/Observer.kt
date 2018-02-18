package behavioral

interface IObservable {
    fun register(observer: IObserver): Boolean
    fun unRegister(observer: IObserver): Boolean
    fun notifyObservers()
}

class Observable : IObservable {
    private var observables = ArrayList<IObserver>()
    override fun register(observer: IObserver) = observables.add(observer)
    override fun unRegister(observer: IObserver) = observables.removeIf { it == observer }

    fun doSth() {
        print("this is doing sth else")
        notifyObservers()
    }

    override fun notifyObservers() = observables.forEach { it.update() }
}


interface IObserver {
    fun update()
}

class Observer : IObserver {
    override fun update() = print("registred")
}