package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week06

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable{

    override fun turnOn() {
        println("$name turned on")
        startRecord()
    }

    override fun turnOff() {
        println("$name turned off")
    }

    override fun startRecord() {
        println("$name starting record")
    }
}