class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int = 0,
    codigoProfessor: Int,
    var quantidadeDeHoras: Int
) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {
}