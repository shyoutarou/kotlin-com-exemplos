// Função lambda são funções simples para a criação de funções ad-hoc 

fun main(){
    // Os exemplos são funções para passar pra maisculo
    // A medida que as funções são criadas existe uma melhora na declaração
    val uppercase1: (String) -> String = { str: String -> str.uppercase() }
    val uppercase2: (String) -> String = { str -> str.uppercase() }
    val uppercase3 = { str: String -> str.uppercase() }
    // val uppercase4 = { str -> str.uppercase() }
    val uppercase5: (String) -> String = { it.uppercase() }
    val uppercase6: (String) -> String = String::uppercase //Aqui faz uma chamada direta, similar ao high_order

    println(uppercase1("hello"))
    println(uppercase2("hello"))
    println(uppercase3("hello"))
    println(uppercase5("hello"))
    println(uppercase6("hello"))
}
