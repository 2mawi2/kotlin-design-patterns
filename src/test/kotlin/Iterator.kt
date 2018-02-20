class IteratorJava(val list: List<Any>) {
    private var idx: Int = 0
    fun hasNext(): Boolean = list.size - 1 <= idx + 1
    fun next(): Any = list[idx++]
}

class IteratorMs(val list: List<Any>) {
    private var idx: Int = 0

    fun reset() {
        idx = 0
    }

    fun moveNext(): Boolean {
        idx++
        return list.size - 1 <= idx + 1
    }

    fun current(): Any = list[idx]
}