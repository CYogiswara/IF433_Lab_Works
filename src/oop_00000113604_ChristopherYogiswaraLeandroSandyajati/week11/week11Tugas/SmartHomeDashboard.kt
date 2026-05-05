package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week11.week11Tugas

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    val device = SmartDevice().apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}