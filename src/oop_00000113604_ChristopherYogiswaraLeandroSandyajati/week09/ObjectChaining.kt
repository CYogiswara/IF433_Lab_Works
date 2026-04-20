package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week09

data class Student(val name: String, val gpa: Double)

fun main(){
    val students = listOf(
        Student("andi", 3.2),
        Student("budi", 3.9),
        Student("citra", 2.8),
        Student("dewi", 3.7),
    )
}