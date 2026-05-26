package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week14

interface Shape{
    fun area(): Int
}

class SafeRectangle(var width: Int, var height: Int): Shape{
    override fun area() = width * height
}

class safeSquare(var side: Int): Shape{
    override fun area() = side*side
}