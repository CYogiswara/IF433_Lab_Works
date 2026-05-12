package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesweek12

fun pembagian(){
    try{
        val a = 10
        val b = 2
        val hasil  =  a/b
        println("hasil bagi: ${hasil}")
    }catch(e:Exception){
        println("Ada error ${e.message}")
    }finally{
        println("Selesai try catch")
    }
}

fun cek_tipe_variable(){
    var angka: Int = try {
        Integer.parseInt("abc")
    }catch(e: Exception){
        println("Ada error ${e.message}")
        777
    }
    println("angka: $angka")
}

fun main(){
    pembagian()
    cek_tipe_variable()
}