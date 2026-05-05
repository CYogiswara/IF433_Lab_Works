package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week11

data class User(var name: String = "", var age: Int = 0)

fun main(){
    println("=== TEST APPLY ===")
    val user = User().apply{
        name = "Yogi"
        age = 19
    }
    println(user)
}