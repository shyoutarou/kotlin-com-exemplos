// É possivel declarar o tipo de parametro da função
// Com os dois pontos após declarar a função pode ser definido o tipo de retorno dela
// Unit, neste caso, está sendo usado, mas a função não retorna nada
fun print_message(message:String): Unit{
    println(message)
}

// Neste caso, o valor padrão de prefix é "info", assim, caso não seja atribuido um valor na chamada da função
fun print_message_with_prefix(message:String,prefix:String = "Info"){
    println("[$prefix] $message")
// A interpolação de string funciona com $
}

fun sum(x:Int,y:Int) : Int {
    return x+y
}

// Inline function, é definida e declarada na mesma linha
fun multyply(x: Int,y: Int) = x * y

fun main(){
    print_message("Teste")
    print_message_with_prefix("Olá","Teste")
    print_message_with_prefix("Olá")
    println(sum(3,4))
    println(multyply(3,4))
}
