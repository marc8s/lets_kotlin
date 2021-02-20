class Pessoa(var nome: String, val anoNascimento: Int){
    fun saudacao(){
        println("Olá, meu nome é $nome")
    }
}

fun main(){
    val pessoa: Pessoa = Pessoa(nome = "Marcus", anoNascimento = 1992)
    println(pessoa.nome)
    println(pessoa.anoNascimento)
    pessoa.saudacao()
}