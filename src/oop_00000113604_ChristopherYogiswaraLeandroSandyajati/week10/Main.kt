package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week10

fun main(){
    println("\n=== TEST GENERIC CLASS ===")
    val intBox = box(100)
    val stringbox = box("Generics in kotlin")

    println("Isi intbox: ${intBox.value}")
    println("Isi stringbox: ${stringbox.value}")

    println("\n=== TEST MULTIPLE VARIABLES ===")

    val itemPrice = PairBox("Bitcoin", 65000)
    println("asset: ${itemPrice.key}, harga: ${itemPrice.value} USD")

    println("\n=== TEST GENETIC FUNCTION ===")
    printData(3.14)
    val results = processData("Stable coin")
    println("Hasil proses: $results")

    println("\n=== TEST CONSTRAINTS ===")
    val math = Mathbox(10.5,20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${getMax(45,90)}")
}