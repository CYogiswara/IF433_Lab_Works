package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week06

class Gopay: PaymentMethod{
    override fun pay(amount: Double){
        println("Processing Rp$amount via gopay server")
    }
}

class CreditCard: PaymentMethod{
    override fun pay(amount: Double){
        println("Contacting bank for Rp$amount")
    }
}