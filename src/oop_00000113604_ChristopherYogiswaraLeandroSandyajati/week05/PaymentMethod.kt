package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week05

abstract class PaymentMethod(val accountName: String){
    abstract fun processPayment(amount: Double)
}