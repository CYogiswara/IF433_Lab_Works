package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week04

open class Developer(name: String, baseSalary: Int, val programmingLanguanges: String): Employee(name, baseSalary){
    override fun work(){
        println("$name sedang ngoding menggunakan $programmingLanguanges")
    }
}