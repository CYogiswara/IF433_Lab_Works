package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week02

import java.util.Scanner

fun library(){
    val scanner = Scanner(System.`in`)

    println("Masukan Judul Buku: ")
    val title: String = scanner.nextLine()

    println("Masukan Nama Anda: ")
    val borrower: String = scanner.nextLine()

    println("Masukan Lama Meminjam: ")
    var duration: Int = scanner.nextInt()

    if(duration < 0){
        duration = 1
    }

    val details = Loan(title, borrower, duration)

    println("${details.borrower} meminjam ${details.bookTitle} selama ${details.loanDuration} hari, total denda: ${details.calculateFine()}")
}