package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesweek14

class proses_khs {
    fun hitung_nilai_tugas(quiz: Double, aktivitas: Double): Double {
        return (quiz * 0.3) + (aktivitas * 0.7)
    }

    fun hitung_nilai_akhir(UTS: Double, UAS: Double, tugas: Double): Double {
        return (UTS * 0.3) + (UAS * 0.4) + (tugas * 0.3)
    }
}
class proses_db{
    fun simpan_na_db(nim: String, nama: String, nilaiAkhir: Double): String{
        return "KHS $nim nama $nama dapat nilai $nilaiAkhir"
    }

    fun load_db(nim: String): String{
        return "Berhasil load data $nim"
    }
}

fun main(){
    val khsMhs = proses_khs()
    val prsDB = proses_db()
    val nilaiTugas = khsMhs.hitung_nilai_tugas(83.57, 76.45)
    val nilaiAkhir = khsMhs.hitung_nilai_akhir(78.97, 78.99, nilaiTugas)

    val statSimpan: String = prsDB.simpan_na_db("123", "Yogi", nilaiAkhir)
    println(statSimpan)
}