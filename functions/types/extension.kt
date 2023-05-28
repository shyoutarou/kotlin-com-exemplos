// Mecanismos de extensão permitem adicionar novos membros pra qualquer classe
// Existem dois tipos: funções e propriedades
// É necessário especificar o tipo que é extendido

data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>) 
//Ordem possui coleção de itens

fun Order.max_value(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
// Recebendo os valores retorna o maior valor
// Caso seja null, passe o valor para 0

fun Order.max_name() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"
// Similar ao anterior, retorna o nome do de maior valor

val Order.comma: String //Declaração de atributo novo dentro de "order"
    get() = items.map { it.name }.joinToString() // Retorna um map dos nomes concatenados

fun main(){
    
    val order = Order(listOf(Item("Bread", 25.0F),Item("Wine", 29.0F), Item("Water",12.0F)))

    println("Max priced item name: ${order.max_name()}")
    println("Max priced item value: ${order.max_value()}")
    println("Items: ${order.comma}")
}
