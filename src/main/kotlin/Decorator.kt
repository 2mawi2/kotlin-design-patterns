interface IComponent {
    fun operate()
}

class ConcreteComponent : IComponent {
    override fun operate() = println("operating")
}

abstract class Decorator(private val component: IComponent) : IComponent by component

class ComponentDecorator(component: IComponent) : Decorator(component) {
    fun decoratedOperation() = println("signature of Component has been extended")
}

class AnotherDecoratedComponent(component: IComponent) : Decorator(component) {
    fun decoratedOperation() = println("signature of Component has been extended")
}

