// Executa um bloco de código em um objeto e retorna o próprio objeto

data class Person(var name: String, var age: Int, var about: String){
    constructor() : this("",0,"") //Sobrecarga de construtor com ele vazio, assim, se for chamado
    // ele inicia com essas instâncias
}

fun main(){
    val pes = Person()
    val string_desc = pes.apply { //Assim atribuimos os valores dessa instância
        name = "Vinicius"
        age = 30
        about = "Informational system undergraduate"
    }.toString()

    println(string_desc)
}
