package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week07

enum class ItemRarity(val dropChance: Int){
    COMMON(70),
    UNCOMMON(60),
    RARE(50),
    EPIC(40),
    LEGENDARY(30)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity){

}