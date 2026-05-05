package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week11

data class User(var name: String = "", var age: Int = 0)


fun main(){
    println("=== TEST APPLY ===")
    val user = User().apply{
        name = "Yogi"
        age = 19
    }
    println(user)

    println("=== TEST ALSO ===")
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    numbers.also{
        println("Log sebelum ditambah: $it")
    }.add(6)
    println("Log setelah ditambah: $numbers")

    println("=== TEST WITH ===")
    with(user){
        println("User detail -> nama: $name, umur: $age")
    }

    val newUser = User("Budi",20).apply {
        age = 21
    }.also{
        println("user baru berhasil dibuat: $it")
    }
}