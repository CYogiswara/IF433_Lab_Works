package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesweek14

class proses_khs {
    fun hitung_nilai_tugas(quiz: Double, aktivitas: Double): Double {
        return (quiz * 0.3) + (aktivitas * 0.7)
    }

    fun hitung_nilai_akhir(UTS: Double, UAS: Double, tugas: Double, jns_kurikulum: jenis_kurikulum): Double {
        return jns_kurikulum.hitung_nilai_bobot(UTS, UAS, tugas)
    }
}

interface jenis_kurikulum{
    fun hitung_nilai_bobot(uts:Double, uas:Double, tugas:Double): Double{
        return 1.0
    }
}

class kurikulum_2013: jenis_kurikulum{
    override fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double {
        return (uts*0.3) + (uas*0.4) + (tugas*0.3)
    }
}

class kurikulum_merdeka: jenis_kurikulum{
    override fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double {
        return (uts*0.2) + (uas*0.3) + (tugas*0.4)
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

class manager_hitung_khs{
    fun mulai_perhitungan(quizTugas: Double, aktivitasTugas: Double, utsKamu:Double, uasKamu: Double, jns_kurikulum: jenis_kurikulum): Double{
        val khsmhs = proses_khs()
        val nilaiTugas: Double = khsmhs.hitung_nilai_tugas(quizTugas, aktivitasTugas)
        val nilaiAkhirMhs: Double = khsmhs.hitung_nilai_akhir(utsKamu, uasKamu, aktivitasTugas, jns_kurikulum)
        return nilaiAkhirMhs
    }
}

class manager_db {
    fun mulai_simpan(nimMhs: String, namaMhs: String, naMhs: Double): String{
        val dbMhs = proses_db()
        return dbMhs.simpan_na_db(nimMhs, namaMhs, naMhs)
    }
}

fun main(){
    val mngKhs = manager_hitung_khs()
    val naMhs1 = mngKhs.mulai_perhitungan(85.73, 87.30, 70.84, 93.57, kurikulum_2013())

    val mngDb = manager_db()
    println(mngDb.mulai_simpan("123", "Yogi", naMhs1))
}