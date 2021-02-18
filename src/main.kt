fun calculaIdade(a: Int, b: Int){
    var idade = a - b
    println("A idade é $idade")
}
fun hello(nome: String) : String{
    return "Olá, $nome"
}
fun main(){
    val anoNascimento = 1992
    val anoAtual = 2021
    var nome = "Marcus"
    calculaIdade(anoAtual, anoNascimento)
    println(hello(nome))
}