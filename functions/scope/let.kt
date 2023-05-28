// A biblioteca padrão let pode ser usado no scopo e checagem de nulls
// Executa um bloco de código e retorna sua ultima expressão
// O objeto é acessivel dentro do bloco pela referência it ou pelo nome que for dado

fun upper_print(s: String){
    print(s.uppercase())
}

fun print_non_null(s: String?){    
    s?.let{ //Só vai executar se a string não for nula
        print("Printing: ")
        upper_print(s)
        println()
    } 
}

fun print_both_null(s1: String?, s2: String?){ //Apenas se as duas não forem nulas
    s1?.let {first_string -> 
        s2?.let {   second_string ->
            upper_print("$first_string : $second_string")
        }
    }
}

fun main(){
    val nome = "teste".let{
        upper_print(it)
        it.isEmpty()
    }
    println(" is empty: $nome")

    print_non_null(null)
    print_non_null("teste")
    print_both_null("teste","outro")
}
