package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesWeek08

class Alamat(val kota: String?)
class Mahasiswa(val address: Alamat)

fun main(){
    val mhs1 = Mahasiswa(Alamat("Tangerang"))
    val mhs2 = Mahasiswa(Alamat(null))

    println("mahasiswa1: ${mhs1.address.kota}")
    println("mahasiswa2: ${mhs2.address.kota}")

    val tetapALamat = Alamat("Jakarta")
    val defaultKota = tetapALamat.kota?.let {
        adrs -> "Alamatnya adalahhh $adrs"
    }?: "Alamat kamu kosong"
    println("${defaultKota}")
}