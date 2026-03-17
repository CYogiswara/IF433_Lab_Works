package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesweek07

class Hitungan private constructor(val tipe: String){
    fun showData(){
        Hitungan("Isi param class: ${tipe}")
    }
    companion object{
        const val namaMtk: String = "Matematika"
        fun tambah(a: Int, b: Int){
            println("Hasil perhitunhan:" + (a+b))
        }

        fun kali(a:Int, b:Int){
            println("Hasil perhitunhan:" + (a*b))
        }

        fun buatData(tipeUser: String){
            Hitungan(tipeUser)
        }

    }
}