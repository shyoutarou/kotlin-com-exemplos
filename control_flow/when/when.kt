fun main(){
    case(1)
    case("test")
    case(0L) //Exemplo de long 
    case("Outro")
    case(Experimento())
}

fun case(obj: Any){ //Assim declaramos que qualquer parâmetro poderá ser recebido
    //Não há necessidade de break, quando uma das condições é verdadeira ele já para nela
    when(obj){ //É basicamente um switch case junto de if, mas com setinha
        1 -> println("One")
        "test" -> println("It works")
        is Long -> println("Long number") //É possível verificar pelo tipo
        !is String -> println("Not a string")
        else -> println("Unknowm") //O caso default 
    }
}

class Experiment

