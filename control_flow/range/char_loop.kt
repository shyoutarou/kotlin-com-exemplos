fun main(){
    for (c in 'a' .. 'd'){ //Também é possível iterar os loops utilizando char
        print("$c | ")
    }

    println()

    for(c in 'z' downTo 'a' step 2){
        print("$c | ")
    }
    
    println()

    val x = 2

    if(x in 1..5){ //Também é possível utilizar range nas estruturas de condição para verificar 
        // se um valor está dentro de um determinado range 
        println("x is in range from 1 to 5")
    }

    if(x !in  6..10){
        println("x isn't in range from 6 to 10")
    }

}
