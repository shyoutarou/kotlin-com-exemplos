fun main(){
    //Se um tipo já foi definido para uma variável não é possível modificar e fazer com que seja nula
    //A não ser que após o tipo seja colocado um '?'
    //Caso ocorra uma inferencia, não é possivel passar a variável para null
    var nullable: String?
    nullable =  null

    fun str_length(word: String?): Int{
        return word?.length ?: 0 //Função para retornar tamanho de str e operação similar a ternário
    }
    println(str_length(nullable))
    println(str_length("teste"))
}
