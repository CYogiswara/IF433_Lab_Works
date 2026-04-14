package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes


open class Kendaraan(){
   private var merk: String = ""
    private var speed: Int = 0

    open fun jalanMaju(){
        println("Jalannnnnn!!!!!!! PARENT $speed")
    }
}

fun main(){
        val name: String? = null
    try{
        println("hai $name")
        println("Panjang huruf ${name!!.length}")
    }catch (e:Exception){
        println("error: ${e.message}. Caused by: ${e.cause}")
    }

    val mixedData: List<Any?> = listOf(1, "Budi",10, "Online", null)
    for(item in mixedData){
        val hasil = item as? String
        if(hasil != null){
            println(hasil)
        }
    }
}