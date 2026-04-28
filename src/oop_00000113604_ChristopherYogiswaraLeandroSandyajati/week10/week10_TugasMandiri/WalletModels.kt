package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week10.week10_TugasMandiri

data class Coin(override val name: String, val balance: Double): Named
data class Transaction(val id: Int, val amount: Double)