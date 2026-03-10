package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week06

class Smartphone : Camera, Phone{
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi smartphone berhasil booting")
    }
}