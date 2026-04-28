package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week10.week10_TugasMandiri

interface Named {
    val name: String
}

class WalletRepository<T: Named>{
    private val items =  mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }

    fun getAll(): List<T>{
        return items
    }

    fun findByName(query: String): List<T> {
        return items.filter { it.name.contains(query, ignoreCase = true) }
    }
}