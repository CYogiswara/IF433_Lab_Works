package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week02

class Student(
    val name: String,
    val nim: String,
    val major: String
){
    init{
        if(nim.length != 5){
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name munkin akan bermasalah di sistem.")
        }else{
            println("LOG: Objek student $name berhasil dialokasikan di Memory")
        }
    }
}