package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes

class ChildMobil(): Kendaraan(){
    private var jmlBan: Int = 0
    init{
        jmlBan= 4
        println("Mobil punya $jmlBan")
        super.jalanMaju()
    }

    final override fun jalanMaju(){
        println("Jalannnnnn!!!!!!! anak $jmlBan")
    }
}