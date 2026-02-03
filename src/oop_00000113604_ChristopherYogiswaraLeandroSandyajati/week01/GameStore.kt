package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week01

fun main(){
    val gameTitle: String = "game"
    val price: Int = 600000
    val userNote: String? = null

    printReceipt(title = gameTitle, originalPrice = price, note = userNote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price * 80 / 100 else price * 90 / 100

fun printReceipt(title: String, originalPrice: Int, note: String?){
    val finalPrice = calculateDiscount(originalPrice)
    val noteMessage = note ?: "Tidak ada catatan"

    println("Nama game: $title")
    println("Harga awal: $originalPrice")
    println("harga akhir: $finalPrice")
    println("user note: $noteMessage")
}