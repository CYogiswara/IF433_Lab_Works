package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week12.week12tugas

sealed class FeederExceptions(msg: String): Exception(msg)

class FoodEmptyException(requested: Int, available: Int): FeederExceptions("Kibble tidak cukup! diminta $requested gr, sisa $available gr")

class DispenserJamException: FeederExceptions("Wadah dispenser tersangkut/macet")