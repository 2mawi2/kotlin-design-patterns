package structural


internal interface Graphic {
    fun print()
    fun getAll(): List<Graphic>
}

internal class CompositeGraphic : Graphic {
    private val childGraphics = ArrayList<Graphic>()
    override fun print() = childGraphics.forEach { it.print() }
    override fun getAll(): List<Graphic> = childGraphics.flatMap { it.getAll() }
    fun add(graphic: Graphic) = childGraphics.add(graphic)
    fun remove(graphic: Graphic) = childGraphics.remove(graphic)
}

internal class Ellipse(private val name: String = "Ellipse") : Graphic {
    override fun getAll(): List<Graphic> = listOf<Graphic>(this)
    override fun print() = println(name)
}
