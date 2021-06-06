open class Professor(
    nome: String,
    sobrenome: String,
    var tempoDeCasa: Int = 0,
    var codigoProfessor: Int = 0
) : Pessoa(nome, sobrenome) {
}