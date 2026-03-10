package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week06

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable{
    override fun turnOn(){
        println("$name turned on")
    }

    override fun turnOff(){
        println("$name turned off")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}