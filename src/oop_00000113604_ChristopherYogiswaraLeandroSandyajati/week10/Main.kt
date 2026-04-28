package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week10

fun main(){
    println("=== TEST GENERIC CLASS ===")
    val intBox = box(100)
    val stringbox = box("Generics in kotlin")

    println("Isi intbox: ${intBox.value}")
    println("Isi stringbox: ${stringbox.value}")
}