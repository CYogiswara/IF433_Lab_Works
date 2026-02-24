package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes

open class Employee {
    private var nama:String = "Belum ada"
    private var gaji: Int = 0
    protected var namaPacar: String = "Jomblo"
    public var umur: Int = 0
        set(value){
            if(value < 0){
                println("Masa umur minus")
            }else{
                field = value
            }
        }
        get(){
            return field
        }


    public fun set_nama(namakamu: String){
        if(nama.length == 0){
            println("nama gaboleh kosong")
        }else{
            this.nama = namakamu
        }
    }

    public fun get_nama(): String{
        return this.nama
    }

    public fun set_gaji(gajimu: Int){
        if(gajimu < 0){
            println("Gaji tidak bisa kurang dari 0")
        }else{
            this.gaji = gajimu
        }
    }

    public fun get_gaji():Int {
        return this.gaji
    }
}

class privateData(): Employee(){
    fun ambil_data_pacar():String{
        return this.namaPacar
    }
}

fun main(){

    var dp = privateData()
    dp.umur = 20
    println(dp.ambil_data_pacar())
    println(dp.umur)
    /*var employees = Employee()
    employees.set_nama("Yogi2")
    employees.set_gaji(-100)
    println(employees.get_nama())
    println(employees.get_gaji())*/
}