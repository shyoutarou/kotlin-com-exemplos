class Customer

class Contact(val id: Int, var email: String)

fun main(){
    val cus = Customer() //Para instanciar classes não há necessidade de usar new ou outro comando
    
    val cont = Contact(1,"teste@gmail.com")

    cont.email = "novo@gmail.com"
    println(cont.id)
    println(cont.email)
}
