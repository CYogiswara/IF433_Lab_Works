package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.testingMultiple

class Square(val side: Double): Shape(){
    override fun calculateArea(): Double{
        return side * side
    }
}

fun main(){
    val s = Square(6.0)
    println(s.calculateArea())

}