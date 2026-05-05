package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesweek11

fun String.dasarExtention(): String{
    return "Halo, $this"
}

fun String.RubahHurufBesarDepan(): String{
   var hasil = ""
   hasil = this.split("").joinToString(""){
       it.replaceFirstChar{
           c -> c.uppercase()
       }
   }
    return hasil
}

fun main(){
    println("Yogi".dasarExtention())

    val nama1 = "Budi Sihombing"
    println(nama1.uppercase())

    println("Budi udin".RubahHurufBesarDepan())
}