package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda ontel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val electricCar = ElectricCar("Tesla", 4, 100)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()
}