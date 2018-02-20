import org.testng.annotations.Test


class DecoratorTests {
    @Test
    fun `Decorator pattern should work`() {
        val component: IComponent = ConcreteComponent()
        val decoratedComponent = ComponentDecorator(component)
        val anotherDecoratedComponent = AnotherDecoratedComponent(ComponentDecorator(component))

        component.operate()

        decoratedComponent.operate()
        decoratedComponent.decoratedOperation()

        anotherDecoratedComponent.operate()

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