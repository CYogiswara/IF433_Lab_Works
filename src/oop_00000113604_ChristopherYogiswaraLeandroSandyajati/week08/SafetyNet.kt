package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week08

fun main(){
        val name: String? = null
    try{
        println("hai $name")
        println("Panjang huruf ${name!!.length}")
    }catch (e:Exception){
        println("error: ${e.message}. Caused by: ${e.cause}")
    }
}