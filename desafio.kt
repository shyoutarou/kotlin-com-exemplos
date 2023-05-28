enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome:String, val id: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int, val level: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val level: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun show_user(){
        for(user in inscritos){
            println("User ${user.id} | ${user.nome}")
        }
    }

    fun show_content(){
        for(content in conteudos){
            println("Name: ${content.nome} | Time: ${content.duracao} | Level: ${content.level}")
        }
    }
}


fun main() {
    val algo = ConteudoEducacional("Python",100,Nivel.BASICO)
    val prog = ConteudoEducacional("C",100,Nivel.BASICO)
    val poo = ConteudoEducacional("Dart",100,Nivel.INTERMEDIARIO)
    val us1 = Usuario("Vinicius",1)
    val us2 = Usuario("Tallys",2)

    val grade = mutableListOf<ConteudoEducacional>()
        grade.add(algo)
        grade.add(prog)
        grade.add(poo)

    
    val bsi = Formacao("BSI",grade,Nivel.DIFICIL)
    println("--------Curso--------")
    println("\t${bsi.nome} -- ${bsi.level}")
    println("---------------------")

    bsi.matricular(us1)
    bsi.matricular(us2)

    println("\n-------Usuários-------")
    bsi.show_user()
    println("----------------------")
    println("\n--------Content-------")
    bsi.show_content()
    println("---------------------")
}

// "Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos)
// Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.
// Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão
