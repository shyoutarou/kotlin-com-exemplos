open class Dog{ //A classe open quer dizer que ela pode ser utilizada por outras classes, como extensão
    open fun say_hi(){ //Mesma coisa da classe
        println("Wow wow")
    }
}

class Terrier : Dog(){ // : é a extensão da classe, nesse caso, terrier é um cachorro, 
    // assim herda todas as caracterísitcas e comportamentos
    override fun say_hi(){ //Já que say_hi é open podemos sobscrevela
        println("wif wif")
    }
}

fun main(){
    val dog: Dog = Terrier()
    dog.say_hi()
}
