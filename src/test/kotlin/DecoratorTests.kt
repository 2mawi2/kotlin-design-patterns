import org.testng.annotations.Test
import structural.AnotherComponentDecorator


class DecoratorTests {
    @Test
    fun `Decorator pattern should work`() {
        val component: IComponent = ConcreteComponent().apply {
            name = "component 1"
        }
        val decoratedComponent = ComponentDecorator(component)
        val anotherDecoratedComponent = AnotherComponentDecorator(ComponentDecorator(component))

        component.operate()

        decoratedComponent.operate()
        decoratedComponent.decoratedOperation()

        anotherDecoratedComponent.operate()

        anotherDecoratedComponent.isNameToBeChanged = false
        anotherDecoratedComponent.operate()

        /**
         * component 1 is operating
         * component 1 decorated is operating
         * decorated operation of component 1 decorated has been called
         * component 1 decorated decorated is operating
         * component 1 decorated decorated decorated is operating
         */
    }
}