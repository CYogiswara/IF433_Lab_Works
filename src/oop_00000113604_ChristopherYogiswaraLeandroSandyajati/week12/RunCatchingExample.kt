package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}