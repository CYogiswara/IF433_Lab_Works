package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week01

fun main(){
    val gameTitle: String = "game"
    val price: Int = 600000

    printReceipt(title = gameTitle, originalPrice = price)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price * 80 / 100 else price * 90 / 100

fun printReceipt(title: String, originalPrice: Int){
    val finalPrice = calculateDiscount(originalPrice)

    println("Nama game: $title")
    println("Harga awal: $originalPrice")
    println("harga akhir: $finalPrice")
}