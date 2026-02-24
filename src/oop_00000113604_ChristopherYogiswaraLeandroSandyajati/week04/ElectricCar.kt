package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week04

open class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): car(brand, numberOfDoors){
    final override fun accelerate(){
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")
    }
}