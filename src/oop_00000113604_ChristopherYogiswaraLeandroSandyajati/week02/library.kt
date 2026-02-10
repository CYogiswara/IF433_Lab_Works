package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week02

import java.util.Scanner


class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
){
    fun calculateFine(): Int{
        if(loanDuration > 3){
            return (loanDuration - 3) * 2000
        }else if(loanDuration <= 3){
            return 0
        }
        return 0
    }
}

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

fun main(){
    library()
}