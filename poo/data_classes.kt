// Data classes são classes projetadas para o armazenamento de valores
// Elas são automaticamente implementadas com metodos uteis para manipular e transportar esses dados
// Muito utilizadas em conjunto com apis

data class User(val name: String, val id:Int){
    override fun equals(other: Any?) = //Esta sendo feita uma sobrescrita da função interna equals, assim
    // modificando a função e verificando apenas se os id são iguais
        other is User && other.id == this.id
}

fun main(){
    val user = User("Vinicius",1)
    println(user) // Já que ela é uma classe data, a maneira que ela é printada é um pouco diferente, mais legivel

    val second_user = User("Vinicius",1)
    val third_user = User("Teste",2)
    println("user == second_user: ${user == second_user}")
    println("user == third_user: ${user == third_user}")

    // a função hashCode pega o que está no objeto e gera um hascode para isso
    println(user.hashCode())
    println(second_user.hashCode())
    println(third_user.hashCode())

    // Com a função copy pode-se criar uma nova instancia, mas com os mesmo  valores 
    println(user.copy())
    println(user === user.copy())
    println(user.copy("Novo")) // Também é possível passar os parametros da instancia, assim modificando
    println(user.copy(id = 4))

    println("name: ${user.component1()}") // Também é possível acessar as características daquela instância 
    // reconhecidas como component
    println("id: ${user.component2()}")
}
