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