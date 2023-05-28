//Generics da flexibilidade na tipagem das informações
//O generic é passando entre <> e chamado no parametro
class MutableStack <e>(vararg items:e){

    private val elements = items.toMutableList() //Converte os elementos do construtuor para uma lista

    fun push(element: e) = elements.add(element) //Adiciona o elemento 

    fun peek(): e = elements.last() //Pega o ultimo elemento

    fun pop(): e = elements.removeAt(elements.size -1) //Remove o último elemento

    // fun is_empty() = elements.is_empty() //Verifica se está vazia

    fun size() = elements.size //tamanho da lista

    override fun toString() = "MutableStack (${elements.joinToString()})" //Convertendo a lista para texto
}

fun <e> MutableStackOf(vararg elements:e) = MutableStack(*elements) //Também é possível determinar funções com tipos genéricos

fun main(){

    val new_stack = MutableStackOf(1,2,3,5)
    println(new_stack)
    val stack = MutableStack("A","B","C","D")

    stack.push("E")
    println(stack) //Aqui é chamada a função to string

    println("peek(): ${stack.peek()}")
    
    for(i in 1..stack.size()){ //Roda no tamanho da lista e vai retirando o ultimo termo
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}
