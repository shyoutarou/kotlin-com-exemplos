// Função que consegue acessar membros de seu argumento

class Configurantion(var host: String, var port: Int)

fun main(){
    val config = Configurantion("127.0.0.1", port = 1000)

    //Isso pode ser feito
    with(config){
        println("$host : $port")
    }

    //ou
    config.run{
        println("$host : $port")
    }
    //Ao inves de: $config.host ou config.port    
}


