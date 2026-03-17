package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week07

import javax.xml.crypto.Data

fun main(){
    println("=== TEST SINGLETON ====")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("=== TEST COMPANION OBJECT ====")
    val client = NetworkClient.createClient()
    client.connect()
}