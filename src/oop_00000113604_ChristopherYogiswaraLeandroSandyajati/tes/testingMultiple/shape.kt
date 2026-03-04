package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.testingMultiple

abstract class Shape {
    val color: String = "Blue"

    abstract fun calculateArea(): Double

    fun display(){
        println("I'am shape")
    }
}