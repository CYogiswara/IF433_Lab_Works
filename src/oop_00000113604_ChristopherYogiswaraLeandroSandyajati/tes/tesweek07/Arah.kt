package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesweek07

enum class Arah(val petunjuk: String){
    atas("naik"),
    bawah("turun"),
    kiri("belok"),
    kanan("mengsong");

    fun show_params(){
        println("Arah ke ${petunjuk}")
    }
}

