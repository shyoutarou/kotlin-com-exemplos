enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun contains_red() = (this.rgb and 0xFF0000 != 0) //Verificando se a instância da classe contem vermelho
}

fun main(){
    val red = Color.RED
    println(red)
    println(red.contains_red())
    println(Color.GREEN.contains_red())
    println(Color.YELLOW.contains_red())
}
