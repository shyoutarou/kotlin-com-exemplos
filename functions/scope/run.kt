// Similar ao let, executa um código e retorna o resultado
// A diferença é de que dentro do run o objeto só é acessado por this
// Util quando se quer chamar o metodo do objeto e não só passar como argumento
fun main(){
    fun get_null_length(ns: String?){
        println("for \"$ns\":")
        ns?.run{ // Dentro da função ela já identica como se tivesse chamando o "ns"
            println("\tis empty? " + isEmpty()) // Verifica se a string é vázia
            println("\tlength = $length") // Verifica o tamanho da string
            length // Basicamente é o retorno da função
        }
    }

    get_null_length(null)
    get_null_length("")
    get_null_length("teste string")
}
