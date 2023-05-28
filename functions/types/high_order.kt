// A high order function é uma fução que recebe outra função como parametro e retorna uma função

fun calc(x: Int, y: Int, operation: (Int,Int) -> Int): Int{ //Recebindo de funçao operation como parametro
    return operation(x,y)
}

fun sum(x: Int, y: Int) = x + y

fun operation(): (Int) -> Int{ //Retorno de uma função que recebe int e retorna int
    return ::square 
}

fun square(x: Int) = x * x

fun main(){
    val sum_res = calc(4,3,::sum)
    val mul_res = calc(4,5) {a,b -> a*b} //Passagem de função lambda
    println("sum = $sum_res, mul = $mul_res")
    val func = operation()
    println(func(2))
}
