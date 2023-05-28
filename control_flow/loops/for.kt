fun main(){
    val cakes = listOf("Carrot","Cheese","Chocolate","Fuba","Corn") //A declaração de lista se dá atraves do list of
    //basicamente ele possui um vararg interno e pode receber inumeros termos de um tipo

    for (cake in cakes){
        println("Cake: $cake")
    }
}
