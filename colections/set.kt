//A função setOf cria um set "readonly", imutavel
//Já a mutableSetOf cria um  set mutavel
//Set é similar a lista, mas não é ordenado e não aceita duplicatas

val open_issues: MutableSet<String> = mutableSetOf("teste1","teste2","teste3")//Variavel imultavel recebendo uma instancia de um set mutavel

fun add_issue(new_teste:String):Boolean{ //Adicionando novos termos no set
    return open_issues.add(new_teste)
}

fun get_status(is_added: Boolean):String{ //Verificando se o termo ja existe
    return if(is_added) "Registered correctly" else "Marked duplicated and rejected"
}



fun main(){

    val new_issue: String = "teste4"
    val issue_in: String = "teste2"

    println("Issue $new_issue ${get_status(add_issue(new_issue))}")
    println("Issue $issue_in ${get_status(add_issue(issue_in))}")
}
