//É possível filtrar elementos de uma collection
//Utiliza um paramatro lambda, não definido

fun main(){
    val numbers = listOf(1,2,-33,4,5,-6)

    val positives = numbers.filter{ x -> x > 0} //Foi criada uma variável para verificar e 
    //atribuir os valores maiores que zero

    val negatives = numbers.filter{ it < 0} //Caso não queira dar o nome para a váriavel de verificação
    //it já é o padrão

    var doubled = numbers.map {it*2} //Com a função map pode-se atribuir mudanças para todos os elementos
    //da coleção

    val any_negative = numbers.any {it < 0} //any retorna true booleano caso a coleção contenha ao menos
    //um elemento que esteja de acordo com o parametro

    val any_greater = numbers.any {it > 2} 

    println("Numbers: $numbers")
    println("Positive numbers: $positives")
    println("Negatives number: $negatives")
    println("Doubled number: $doubled")
    println("Any negative number: $any_negative")
    println("Any number greater than 2: $any_greater")
}
