package Math

class Line(var x1: Double, var x2: Double, var y1: Double, var y2: Double) : RelactionInterface {
    fun getLength():Double{
        val length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))
        return length
    }
    override fun isEqual(Input: Double): Boolean {
        return Input == getLength()
    }

    override fun isGreater(Input: Double): Boolean {
        return Input < getLength()
    }

    override fun isLess(Input: Double): Boolean {
        return Input > getLength()
    }
}