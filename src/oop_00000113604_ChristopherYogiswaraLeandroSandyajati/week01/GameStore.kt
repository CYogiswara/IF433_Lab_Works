package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week01

fun main(){
    val gameTitle: String = "game"
    val price: Int = 600000

    printReceipt(title = gameTitle, finalPrice = price)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price * 80 / 100 else price * 90 / 100

