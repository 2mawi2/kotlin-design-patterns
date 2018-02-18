import org.testng.Assert.assertEquals
import org.testng.annotations.Test
import structural.CompositeGraphic
import structural.Ellipse


class CompositeTest {
    @Test
    fun `Remove works`() {
        val graphicChild1 = CompositeGraphic()
        val removedEllipse = Ellipse("removed")
        graphicChild1.add(Ellipse("single"))
        graphicChild1.add(removedEllipse)
        graphicChild1.remove(removedEllipse)
        assertEquals(1, graphicChild1.getAll().count())
    }

    @Test
    fun `Composite pattern works with three levels`() {
        //Initialize three composite graphics
        val (graphicChild1, graphicChild2) = createFirstLayer()
        val secondLayerComposites = createSecondLayer(graphicChild1, graphicChild2) // second level
        val thirdLayerComposites = createThirdLayer(secondLayerComposites) // top level

        thirdLayerComposites.print() // should print 8 times
        assertEquals(8, thirdLayerComposites.getAll().count()) // number of all elements should be 8
    }

    private fun createFirstLayer(): Pair<CompositeGraphic, CompositeGraphic> {
        val graphicChild1 = CompositeGraphic()
        val graphicChild2 = CompositeGraphic()
        graphicChild1.add(Ellipse("first")) //Ellipse is basis level
        graphicChild1.add(Ellipse("second"))
        graphicChild1.add(Ellipse("third"))
        graphicChild2.add(Ellipse("fourth"))
        return Pair(graphicChild1, graphicChild2)
    }

    private fun createSecondLayer(graphicChild1: CompositeGraphic, graphicChild2: CompositeGraphic): CompositeGraphic {
        val graphic = CompositeGraphic() // second level
        graphic.add(graphicChild1)
        graphic.add(graphicChild2)
        return graphic
    }

    private fun createThirdLayer(graphic: CompositeGraphic): CompositeGraphic {
        val parentGraphic = CompositeGraphic() // top level
        parentGraphic.add(graphic)
        parentGraphic.add(graphic)
        return parentGraphic
    }
}