class Observable {
    private var observables = ArrayList<IObserver>()
    fun register(observer: IObserver) = observables.add(observer)
    fun unRegister(observer: IObserver) = observables.removeIf { it == observer }

    fun onEvent() {
        print("event handled")
        notifyObservers()
    }

    private fun notifyObservers() = observables.forEach { it.update() }
}


interface IObserver {
    fun update()
}

class Observer : IObserver {
    override fun update() = print("Observer got updated")
}