package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week06

class SmartWatch: Watch(), bluetoothConnectable, rechargeable{
    override fun showTime(){
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connect(){
        println("Mencari perangkat HP di sekitar untuk pairing...")

    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15watt")
    }
}