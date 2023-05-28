//Transforma cada elemento da coleção em um objeto iteravel e faz uma lista da solução
fun main(){
    
    val fruits_bag = listOf("apple","orange","banana","strawberry")
    val clothes_bag = listOf("shirts","pants","jeans")
    val cart = listOf(fruits_bag,clothes_bag) //Criando uma lista com as listas criadas anteriormente
    val map_bag = cart.map {it}
    val flat_map = cart.flatMap {it} //Junta todos os elementos em uma única estrutura 

    println("Bags: $map_bag")
    println("Flat map: $flat_map")
}
