package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week11

fun String.addGreeting(): String{
    return "hello, $this"
}

fun String.repeatTimes(n: Int): String{
    return this.repeat(n)
}

fun String?.isNullOrEmpty(): Boolean{
    return this == null || this.isEmpty()
}

