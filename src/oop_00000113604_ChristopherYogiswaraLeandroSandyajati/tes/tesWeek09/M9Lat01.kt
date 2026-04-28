package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesWeek09

fun main(){
    println("=== LIST OF ===")
    var arrayMhs = listOf("titus", "Budi", "Susi")
    println(arrayMhs)
    println(arrayMhs.size)
    println(arrayMhs[1])

    for(a in arrayMhs){
        println(a)
    }

    println("=== MUTEABLE LIST ===")

    var arrayAngka = mutableListOf<Int>(10,30,40,20,90, 100, 15)
    arrayAngka.add(0,777)
    arrayAngka[2] = 123
    arrayAngka.removeAt(3)
    println(arrayAngka)

    println("\n=== SET OF ===")
    var arrayUrutan = setOf(30,40,30,50,90)
    println(arrayUrutan)
    println(arrayUrutan.size)
    println("ada angka 40 gak?" + arrayUrutan.contains(40))

    println("\n=== MUTABLE SET OF ===")
    var arrayMakanan = mutableSetOf("Nasi", "Bakpao", "Mie", "Ayam")
    arrayMakanan.add("Ketoprak")
    arrayMakanan.add("Mie")
    arrayMakanan.remove("Ketoprak")
    println(arrayMakanan)

    println("\n=== MAP OF ===")
    var arSiswa = mapOf("Andi" to 89, "Toni" to 73, "Ivander" to 90)

    println(arSiswa.size)
    println(arSiswa["Andi"])
    println("key:" + arSiswa.keys)
    println(arSiswa.values)
    println(arSiswa)
    println(arSiswa.keys.elementAt(0))

    println("=== MUTABLE MAP OF ===")
    var arMenu = mutableMapOf("Nasi" to 1000, "Ayam" to 2000, "Sayur asem" to 1500)
    println(arMenu.size)
    arMenu["Nasi"] = 2000
    arMenu.remove("Ayam")
    arMenu.put("Udang", 2300)
    println(arMenu)

    println("\n=== LAMBDA ===")

    fun tambah(a:Int, b:Int):Int{
        return a+b
    }

    var kurang = {a: Int, b: Int -> a-b}
    println("Kurang: " + kurang(3,4))

    var pangkat= {x: Int -> x*x}

    var hitungPangkat: (Int) -> Int = {it * it}
    println(hitungPangkat(5))

    val names = listOf("Alexander", "Bob", "Charlie")
    val sorted = names.sortedBy { it.length }
    println(sorted)
}