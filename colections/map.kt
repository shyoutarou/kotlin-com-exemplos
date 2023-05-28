//A função mapOf cria um map "readonly", imutavel
//Já a mutablemapOf cria um  map mutavel
//Similar ao dicionário do python

const val POINTS: Int = 15
val pass_acount: MutableMap<Int,Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100) //Criando chaves e valores
val pass_report: Map<Int,Int> = pass_acount

fun update_point(account_id:Int){
    if (pass_acount.containsKey(account_id)){ //Verificando se a chave existe no mapa
        println("Update $account_id...")
        pass_acount[account_id] = pass_acount.getValue(account_id) + POINTS //Atribuição direta para chave
    }
    else{
        println("Error: Non-existing account (id:$account_id)")
    }
}

fun account_report(){
    println("Report: ")
    pass_report.forEach { //Percorrendo termos do map somente para leitura 
        k, v -> println("ID $k: credit $v")
    }
}
fun main(){
    account_report()
    update_point(2)
    update_point(7)
    account_report()
}
