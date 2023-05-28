sealed class Mammal(val name: String) 
// Classes seladas permitem a restrição da herança de uma classe
// Só pode ser extendida dentro do mesmo paconte, não é extensivel fora do pacote que foi inseirda

class Cat(val cat_name:String) : Mammal(cat_name)
class Human(val human_name:String, val job:String) : Mammal(human_name)

fun greet_mammal(mammal: Mammal): String{ //A função recebe mamífero como parametro e é generica para os dois
    when(mammal){
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun main(){
    println(greet_mammal(Human("Vinicius","Programmer")))
    println(greet_mammal(Cat("Xanin")))
}
