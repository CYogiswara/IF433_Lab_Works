package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.testingMultiple

class Circle(val radius: Double): Shape(){
    override fun calculateArea(): Double{
        return Math.PI * radius * radius
    }
}

fun main(){
    val c = Circle(5.0)
    println(c.calculateArea())

}