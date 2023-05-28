open class Lion(val name:String,val origin: String){
    fun show(){
        println("The lion $name is from $origin")
    }
}

class Asiatic(name:String) : Lion(name = name, origin = "India")  
// Também é possível dete   rminar parametros a tempo de execução, 
// o nome foi passado no construtor, mas a origem já estava definida

fun main(){
    val lion: Lion = Asiatic("Lion")
    lion.show()
}
