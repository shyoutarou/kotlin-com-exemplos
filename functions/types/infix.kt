// Função que podem ser convertida através de funções membros ou extensões com um único parâmetro

fun main(){
    infix fun Int.times(str: String) = str.repeat(this) //Pega a string de parametro e repete o número de vezes
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina" //Dessa maneira cria um par de strings
    println(pair)

    infix fun String.onto(other:String) = Pair(this,other) //Simula oq está acima
    val mypair = "Mclaren" onto "Lucas" //To e onto funciona para a criação de par
    println(mypair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia //Assim fica mais idiomatico de ler
}

class Person(val name: String){
    val liked_people = mutableListOf<Person>() //Lista mutavel de pessoas gostadas
    infix fun likes(other: Person) { liked_people.add(other)} 
    //Função que adiona pessoas na lista
}
