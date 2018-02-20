import org.testng.annotations.Test
import structural.AnotherComponentDecorator
import structural.Component
import structural.ConcreteComponent
import structural.ComponentDecorator


class DecoratorTests {
    @Test
    fun `Decorator pattern should work`() {
        val component: Component = ConcreteComponent().apply {
            name = "component 1"
        }
        val decoratedComponent = ComponentDecorator(component)
        val anotherDecoratedComponent = AnotherComponentDecorator(ComponentDecorator(component))

        component.operate()
        decoratedComponent.operate()
        anotherDecoratedComponent.operate()

        /**
         * component 1 is operating
         * component 1 decorated is operating
         * component 1 decorated decorated is operating
         */
    }
}