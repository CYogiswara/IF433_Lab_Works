package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesweek12

fun pembagian(){
    try{
        val a = 10
        val b = 2
        val hasil  =  a/b
        println("hasil bagi: ${hasil}")
    }catch(e:Exception){
        println("Ada error ${e.message}")
    }finally{
        println("Selesai try catch")
    }
}

fun cek_tipe_variable(){
    var angka: Int = try {
        Integer.parseInt("abc")
    }catch(e: Exception){
        println("Ada error ${e.message}")
        777
    }
    println("angka: $angka")
}

fun cek_nilai(nilai: Int){
    if(nilai < 0){
        throw IllegalArgumentException("nilai is negative")
    }else{
        println("Nilai: ${nilai}")
    }
}

class cek_saldo_rekening(val pengeluaran: Int, val saldo: Int):
        Exception("saldo sisa: ${saldo}, gak cukup ${pengeluaran}")

class transaksi_keuanggan(val totalBelanja: Int){
    fun narik_uang(balance: Int){
        if(totalBelanja > balance){
            throw cek_saldo_rekening(totalBelanja, balance)
        }else{
            println("transaksi berhasil: ${balance - totalBelanja}")
        }
    }
}
fun main(){
    pembagian()
    cek_tipe_variable()

    try{
        cek_nilai(-10)
    }catch(e:Exception){
        println("Ada error ${e.message}")
    }

    val trx = transaksi_keuanggan(10000)
    trx.narik_uang(500)
}