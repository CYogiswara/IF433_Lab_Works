package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week02

import java.util.Scanner

fun game(){
    val scanner = Scanner(System.`in`)

    print("Masukan Nama Hero: ")
    val heroName: String = scanner.nextLine()

    print("Masukan Damage Heronya: ")
    val heroDamage: Int = scanner.nextInt()

    var enemyHp = 100

    val heroObj = Hero(heroName, 100, heroDamage)

    var choice: Int

    while(heroObj.isAlive() && enemyHp > 0){
        println("1. Serang, 2. Kabur")
        choice = scanner.nextInt()
        if(choice == 1){
            enemyHp -= heroDamage
            if(enemyHp < 0){
                enemyHp = 0
            }
            println("Hp musuh: ${enemyHp}")
        }else{
            println("$heroName kabur")
            break
        }

        if(enemyHp > 0){
            var enemyDamage: Int = (10..20).random()
            heroObj.takeDamage(enemyDamage)

            println("Musuh menyerang dengan damage: ${enemyDamage}")
            println("Hp $heroName: ${heroObj.hp}")
        }
    }

    if (heroObj.hp > 0 && enemyHp <= 0) {
        println("$heroName menang")
    } else if (enemyHp > 0 && heroObj.hp <= 0) {
        println("$heroName kalah")
    } else {
        println("Invalid Round")
    }
}