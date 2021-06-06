class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigoProfessor: Int,
    var quantidadeDeHoras: Int
) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {
}