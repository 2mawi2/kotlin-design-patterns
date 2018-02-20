package structural


abstract class Component {
    var name: String = ""
    abstract fun operate()
}

class ConcreteComponent : Component() {
    override fun operate() = println("$name is operating")
}
/*
this is unnecessary boilerplate in kotlin
rather let the decorators directly implement Component to avoid overhead
abstract class Decorator(protected val component: Component) : Component()
*/

class ComponentDecorator(private val component: Component) : Component() {
    override fun operate() {
        component.name += " decorated"
        component.operate()
    }
}

class AnotherComponentDecorator(private val component: Component) : Component() {
    override fun operate() {
        component.name += " decorated again"
        component.operate()
    }
}