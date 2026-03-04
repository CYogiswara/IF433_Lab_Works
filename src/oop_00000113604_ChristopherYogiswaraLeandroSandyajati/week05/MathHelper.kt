package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week05

class MathHelper(){
    fun hitungLuas(sisi: Int): Int{
        return sisi * sisi
    }
    fun hitungLuas(panjang:Int, lebar: Int): Int{
        return panjang * lebar
    }
    fun hitungLuas(jariJari: Double): Double{
        return 3.14 * jariJari * jariJari
    }
}

fun main(){
    val math = MathHelper()

    println(math.hitungLuas(3))
    println(math.hitungLuas(3, 4))
    println(math.hitungLuas(2.5))
}