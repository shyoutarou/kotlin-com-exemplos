fun main(){
    
    for(i in 0..3){ //Os dois pontos são comprendidos como "inclusive", assim, ele funciona de maneira <= 
        //nesse caso indo de zero até três
        print("$i | ")
    }
    println()

    for(i in 0 until 3){ //Assim iteramos num range que não inclui o termo 3, vai de zero até o termo anterior
        print("$i | ")
    }
    println()

    for(i in 2..8 step 2){ //Incrementa o loop num determinado passo
        print("$i | ")
    }

    println()

    for(i in 3 downTo 0){ //Assim é possível decrementar a iteração
        print("$i | ")
    }
    //Não é possível dar um passo negatívo com o step, por isso o "downTo"
    
    println()
}
