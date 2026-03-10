package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesweek6

class KRS (override val nama: String, override val namaSiswa: String) : Mahasiswa, Siswa {
    override fun belajar(){
        println("$nama sedang belajar")
        println("$namaSiswa sedang belajar")
    }

    override fun serang(){
        println("$nama serang")
        println("$namaSiswa serang")
    }
}