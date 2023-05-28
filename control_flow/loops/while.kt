fun eat_cake(num:Int) = println("You have eated $num cakes")
fun bake_cake(num:Int) = println("You have baked $num cakes")

fun main(){
    var cakes_eaten = 0
    var cakes_baked = 0

    while(cakes_eaten < 5){
        eat_cake(cakes_eaten)
        cakes_eaten++
    }

	println()
    
    do{
        bake_cake(cakes_baked)
        cakes_baked++
    }while(cakes_baked < cakes_eaten)
}
