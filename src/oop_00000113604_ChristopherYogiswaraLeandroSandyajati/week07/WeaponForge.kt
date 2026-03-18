package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week07

class Weapon private constructor(val item: GameItem, val durability: Int){
    companion object{
        fun forgeStarterSword(): Weapon {
            val starterWeapon = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterWeapon, 50)
        }
        fun forgeEpicSword(): Weapon{
            val epicWeapon = GameItem("Pedang emas gg", 20, ItemRarity.EPIC)
            return Weapon(epicWeapon, 150)
        }
        fun upgradedWeapon(base: Weapon, newDamage: Int): Weapon{
            val upgradedItem = base.item.copy(damage = newDamage)
            return Weapon(upgradedItem, base.durability)
        }
    }
}