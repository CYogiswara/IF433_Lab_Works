package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week06

class Button(override val name: String): Clickable{
    override fun click(){
        println("Button $name clicked")
    }
}