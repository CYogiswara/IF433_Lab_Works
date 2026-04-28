package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesWeek10

class nonGeneric(var hasil: Any)

class generic<T>(var hasil: T)

class Kota<T1,T2>(var telp: T1, var alamat: T2)

fun<T: Number> cobaFungsi(angka: T): Int{
    return angka.toInt() + 2
}

//type constraint
fun<T: Number> Kurang(angka: T): Double {
    return angka.toDouble() - 2
}

fun<T: Number> Tambah(angka: T): Int {
    return angka.toInt() + 2
}

//GENERIC PROGRAMMING

class kalkulator<T: Number>(val a: T, val b: T){
    fun kali(): Double{
        return a.toDouble() * b.toDouble()
    }

    fun bagi(): Int{
        return a.toInt() / b.toInt()
    }
}

    fun main() {
        println("=== NON GENERIC ===")
        val nGen = nonGeneric(100)
        val angkaNgen = nGen.hasil as Int
        println(angkaNgen + 50)

        println("=== GENERIC ===")
        val gen = generic(200)
        println(gen.hasil + 50)

        println("=== Generic 2 parameter ===")
        val city = Kota("12345", "Jalan")
        println("Nomor telepon kamu: ${city.telp}")
        println("Alamat kamu: ${city.alamat}")

        println("=== Generiic Function ===")
        println(cobaFungsi(10))

        println("=== GENERIC CONSTRAINT ===")
        println(Tambah(20))
        println(Kurang(20))

        val kalk = kalkulator(5, 5)
        println("Hasil kali: ${kalk.kali()}")
        println("Hasil bagi: ${kalk.bagi()}")
    }
