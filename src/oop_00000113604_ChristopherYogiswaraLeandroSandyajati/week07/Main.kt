package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week07

import javax.xml.crypto.Data

fun main(){
    println("=== TEST SINGLETON ====")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("=== TEST COMPANION OBJECT ====")
    val client = NetworkClient.createClient()
    client.connect()

    println("=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    val data3 = data1.copy(age = 23)
    println("Hasil copy: $data3")

    val (username, age) = data1
    println("Destructured: $username berumur $age")
    println(reg1)
    println("Sama? ${data1 == data2}")

    println("=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik")

    val uimessage = when(response) {
        is ApiResponse.Success -> "Tampilkan ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan spinner"
    }

    println(uimessage)
}