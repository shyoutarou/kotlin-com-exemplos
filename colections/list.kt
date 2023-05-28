//A função listOf cria uma lista "readonly", imutavel
//Já a MutableListOf cria uma lista mutavel

val system_users: MutableList<Int> = mutableListOf(1,2,3) //Criação de uma variável imultavel que recebe uma lista mutavel
val sudoers: List<Int> = system_users //Cópia de somente leitura, imultavel, de "system_users"

fun add_sytem_users(new_user:Int){
    system_users.add(new_user)
}

fun get_sudoers() : List<Int>{
    return sudoers //Apenas retorna a lista de somente leitura
}

fun main(){
    add_sytem_users(4) //Adicionando novo usuário
    println("Total sudoers: ${get_sudoers().size}") //Pegando tamanho da lista de somente leitura
    get_sudoers().forEach{ //Percorrendo a lista e printando para cada item dela
        i ->println("User $i") //Aqui mesmo definindo a variavel de iteração para poder printar
    }

}
