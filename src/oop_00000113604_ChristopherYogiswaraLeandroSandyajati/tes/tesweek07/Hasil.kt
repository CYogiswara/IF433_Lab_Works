package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.tes.tesweek07

import java.net.CacheResponse

sealed class Hasil{
    data class sukses(val data:String): Hasil()
    data class Error(val ex: Exception): Hasil()
    object loading: Hasil()

    fun handle_response(response: Hasil){
        when(response){
            is sukses -> {println("Sukses lempar data")}
            is Error -> {println("Error ${response.ex}")}
            loading -> {println("Loading...")}
        }
    }
}