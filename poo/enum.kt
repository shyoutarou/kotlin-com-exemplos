// Enum classes são utilizadas para modelar tipos que representam set finito de valores, estados, constantes ...

enum class State{
    IDLE, RUNNING, FINISHED //Aqui determinamos os estados presentes na enum
}

fun main(){
    val state = State.IDLE //Passamos o estado de running
    val message = when(state){ //Verificamos o estado armazenado em state e passamos um valor para message
        State.IDLE -> "It's a idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}
