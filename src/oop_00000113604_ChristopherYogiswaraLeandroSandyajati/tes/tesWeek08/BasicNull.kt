package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesWeek08

class profile_page(val idprofile: String, val statusOnline: String?){

    fun gantiFoto(filePhoto: String?){
        println("Foto kamu nama filenya: $filePhoto")
    }
}

fun main(){
    var nama: String? = "Yogi"
    nama = null
    println("nama kamu $nama")

    val profile = profile_page("Nama", null)
    println("ID user: ${profile.idprofile}, status online: ${profile.statusOnline}")

    profile.gantiFoto("NamaFile1.jpg")
}