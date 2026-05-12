package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "100".toInt()
    }.onSuccess {v -> println(v)
    }.onFailure {e -> println(e.message)}

    val safeValue = result.getOrElse { -1 }
    println("safe value: $safeValue")

    val recovered = result.recover{0}.getOrNull()
    println("recovered: $recovered")
}