// also funciona como apply, executa o bloco e retorna o objeto
// Dentro do bloco o objeto é referenciado como it 

data class Person(var name: String, var age: Int, var about: String){
    constructor() : this("",0,"") 
}

fun write_create(p: Person){
    println("A new person ${p.name} was created")
}
fun main(){
    val vini = Person("Vinicius",19,"Informational system undergraduate")
        .also{ //faz isso logo após o bloco acima
            write_create(it)
    }
}
