package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week05

fun main(){
    val eWalletObject = EWallet("yogi", 50.000)
    val creditCardObject = creditCard("yogi", 100.000)

    val Methods: List<PaymentMethod> = listOf(eWalletObject, creditCardObject)

    for(Method in Methods){
        Method.processPayment(75000.0)

        when(Method){
            is EWallet -> {
                eWalletObject.topUp(50000.0)
            }
            is creditCard -> {
                creditCardObject.processPayment((95000.0))
            }
        }

    }
}