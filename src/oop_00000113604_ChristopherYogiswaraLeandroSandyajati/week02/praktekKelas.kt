package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week02

class MyCar(
){
    public var kecepatan: Int = 80
    var warna: String = "Abu"

    fun speed(){
        println("Warnanya: $warna")
    }

    init{
        if(kecepatan > 60){
            println("Cepet")
        }else{
            println("Kurang cepet")
        }
    }

    constructor(speed:Int = 0, brake: Int = 1) : this() {
        kecepatan = speed
        println("Kecepatannya: ${speed} brakenya: ${brake}")
    }
}

fun main(){
    val car = MyCar(speed = 50, brake = 10)
    car.speed()
    car.warna = "Merah"
    println("Warna mobil ini: ${car.warna}")
}