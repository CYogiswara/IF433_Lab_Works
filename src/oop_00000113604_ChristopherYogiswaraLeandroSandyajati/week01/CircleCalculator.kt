package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week01

fun main(args: Array<String>) {
    var radius: Double = 7.0
    var pi: Double = 3.14

    var area: Double = pi * radius * radius

    println("Radius: " + radius + ", Area: " + area)
    checkSize(area)
}

fun checkSize(area: Double){
    val size = if(area > 100) println("This is a big circle") else println("This is a small circle")
}