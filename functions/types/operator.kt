// Alguns operadores pode ser atualizados para operadores, permitindo que sejam chamados pelo simbolo atribuido

fun main(){

    operator fun Int.times(str: String) = str.repeat(this) //Faz uma repetição da string
    println(2 * "Bye")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much"
    println(str[0..14]) //Criando uma substring apartir desse intervalo
}
