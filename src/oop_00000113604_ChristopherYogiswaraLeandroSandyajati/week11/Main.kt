package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week11

fun main(){
    println("=== TEST EXTENSION ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String?= null

    println("Apakah null/empty? ${text.isNullOrEmpty()}")

    println("=== TEST RUN FUNCTION ===")
    val results = "Kotlin".run{
        println("Memproses kata: $this")
        length * 2
    }

    println("Hasil kalkulasi: $results")
}