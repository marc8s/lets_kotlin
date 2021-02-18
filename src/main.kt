fun calculaIdade(a: Int, b: Int){
    println("A idade é ${a-b}")
}
fun hello(nome: String) : String{
    return "Olá, $nome"
}

fun hello2(nome:String) = "Olá, $nome"

fun main(){
    val anoNascimento = 1992
    val anoAtual = 2021
    var nome = "Marcus"
    calculaIdade(anoAtual, anoNascimento)
    println(hello(nome))
    println(hello2(nome))
}