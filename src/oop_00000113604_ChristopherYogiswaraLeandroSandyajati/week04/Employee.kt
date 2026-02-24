package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week04

open class Employee(val name:String, val baseSalary: Int){
    open fun work(){
        println("$name sedang bekerja")
    }

    open fun calculateBonus(): Int{
        val bonus = baseSalary * 10/100
        return bonus
    }
}