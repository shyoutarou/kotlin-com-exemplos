fun <T> T?.nullSafeToString() = this?.toString() ?: "Without value" //Cria um função que funciona para 
// qualquer tipo que pode ser null
// Caso seja nula ele imprimira a mensagem

fun main(){
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}
