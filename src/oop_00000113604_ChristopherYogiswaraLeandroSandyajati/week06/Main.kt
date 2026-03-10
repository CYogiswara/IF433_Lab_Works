package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week06


fun processCheckout(method: PaymentMethod, amount: Double){
    println("Memulai checkout")
    method.pay(amount)
}

fun main(){
    val myWatch = SmartWatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n==== TESTING CHECKOUT ====")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    val smartlamp = SmartLamp("1", "Ruang Tamu")
    val smartspeaker = SmartSpeaker("1", "Google Nest Dapur")
    val smartCCTV = SmartCCTV("1", "SmartCCTV")
}