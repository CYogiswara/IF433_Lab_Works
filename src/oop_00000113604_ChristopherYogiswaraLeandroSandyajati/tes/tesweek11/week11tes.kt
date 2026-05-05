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

fun String.TentukanKelulusan(nilai: Int): String{
    var hasil = ""
    if(nilai> 70){
        hasil = "lulus"
    }else{
        hasil = "Tidak lulus"
    }
    return " "
}

fun String?.CekNullDanEmpty(): String{
    var hasil = ""

    if(this == null ||this.isEmpty()){
        hasil = "Gaboleh null"
    }else{
        hasil = "Password kamu $this"
    }
    return hasil
}



fun main(){
    println("Yogi".dasarExtention())

    val nama1 = "Budi Sihombing"
    println(nama1.uppercase())

    println("Budi udin".RubahHurufBesarDepan())

    println("Masukan nilai kamu:".TentukanKelulusan(71))

    var nilaiKamu = 70.run{
        println(this)
    }
}