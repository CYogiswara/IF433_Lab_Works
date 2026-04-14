package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week08.TugasMandiri

sealed class Product(){}

data class Electronic(val id: String, val name: String, val warrantyMonths: Int): Product(){}

data class Clothing(val id: String, val name: String, val size: String): Product(){}