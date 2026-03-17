package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesweek07

fun main(){
    println("Link: ${Koneksi.koneksi}")
    Koneksi.coba_konek_db()

    Hitungan.tambah(5,5)
    Hitungan.kali(5,5)

    println("Nama markul: ${Hitungan.namaMtk}")

    Hitungan.buatData("user biasa")

    val dt = SaveData(5,10, 15, "Mario")
    println("Nama char ${dt.namaChar}")

    val dtCopy = dt.copy(namaChar = "Luigi")
    println("Nama char ${dtCopy.namaChar}")

    val Ara = Arah.atas

    println(Ara.show_params())

    val hsl: Hasil = Hasil.sukses("Berhasil")
    hsl.handle_response(hsl)
}