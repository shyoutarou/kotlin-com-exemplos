open class Tiger(val origin: String){
    fun say_hello(){
        println("A tiger from $origin says hello")
    }
}

class SiberianTiger : Tiger("Siberia")

fun main(){
    val tiger = SiberianTiger()
    tiger.say_hello()
}
