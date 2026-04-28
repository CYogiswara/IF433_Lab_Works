package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week10.week10_TugasMandiri

fun main(){
    coinRepo.add(Coin("BTC", 64000.0))
    coinRepo.add(Coin("ETH", 65000.0))
    coinRepo.add(Coin("USDT", 70000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    val res = listOf(response)
    res.forEach { println(it) }
}