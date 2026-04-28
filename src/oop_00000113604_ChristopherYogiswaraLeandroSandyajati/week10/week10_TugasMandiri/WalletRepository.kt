package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week10.week10_TugasMandiri


class WalletRepository<T>{
    private val items =  mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }

    fun getAll(): List<T>{
        return items
    }

    fun findBy(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}