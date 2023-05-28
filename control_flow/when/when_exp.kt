fun main(){
    println(when_exp(1))
    println(when_exp("Hello"))
    println(when_exp("teste"))
    println(when_exp(1L))
    println(when_exp(Experiment()))
}

fun when_exp(obj:Any): Any{
    val result = when(obj){ //É possível declarar uma variável dessa maneira, assim fará a validação e terá seu valor
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> "Other"
    }
    return result
}

class Experiment
