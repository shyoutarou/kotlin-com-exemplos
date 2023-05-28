fun main(){

    fun print_all(vararg messages: String){ //Com o vararg conseguimos passar uma quantidade indefinida de termos 
//de um determinado tipo 
        for (text in messages){ //Ele trabalha como se fosse uma lista
            println(text)
        }
    }

    fun print_all_prefix(vararg messages: String, prefix: String){
        for (text in messages){
            println(prefix + text)
        }
    }

    fun log(vararg entries: String){
        print_all(*entries) // Com o * conseguimos passar o parametro como uma array    
    }
    
    log("teste","vinicius","eu", "saudações")
}
