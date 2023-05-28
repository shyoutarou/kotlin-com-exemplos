class Animal(val name: String)

class Zoo(val animals: List<Animal>){   // Zoo recebe uma lista de animais
    
    operator fun iterator(): Iterator<Animal>{ //Com essa função padrão da linguagem pode-se iterar os termos
        return animals.iterator()
    }
}
fun main(){
    val animals = listOf(Animal("Giraffe"),Animal("Zebra"))

    val zoo = Zoo(animals)
    
    for(animal in zoo){ //Graças a função criada na classe pode-se iterar suas características
        println("Watch out, it's a ${animal.name}")
    }
}
