package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week07

class GameExecutor{

}
fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
            println("Monster Encountered: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            println("Dropped Loot: ${event.item}")
        }
        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }
        is BattleState.SafeZone -> {
            println("You are in safe zone")
        }
    }
}