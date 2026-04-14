package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week08

fun main(){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("Tujuan pengiriman $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let {
        price -> val tax = price * 0.11
        "Transaksi valid. Harga: Rp$price, pajak: Rp$tax"
    }?: "Transaksi invalid: Harga belum di-set"

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "smartphone",
        1500000,
        UserProfile("Yogi", null),
        "Laptop",
        4500000.0
    )

    for(item in mixedData){
        val text = item as? String

        text?.let{
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100

    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback : $safeString")
}