package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week05

fun main(){
    val eWalletObject = EWallet("yogi", 50.000)
    val creditCardObject = creditCard("yogi", 100.000)

    val PaymentMethods: List<PaymentMethod> = listOf(eWalletObject, creditCardObject)

    for(PaymentMethod in PaymentMethods){
        PaymentMethod.processPayment(75000.0)
    }
}