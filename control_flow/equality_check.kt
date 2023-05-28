fun main(){
    
    val authors = setOf("Shakespeare","Hemingway","Twain") //Set é similar a uma lista, mas não aceita elementos duplicados
    val writers = setOf("Twain","Shakespeare","Hemingway")

    println(authors == writers) //Comparação estrutural
    println(authors === writers) //Comparação referencial, verificar se ambas possuem a mesma referência
}
