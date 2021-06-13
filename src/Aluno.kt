class Aluno(
    nome: String,
    sobrenome: String,
    var codigoAluno: Int
) : Pessoa(nome, sobrenome) {

    override fun equals(other: Any?): Boolean {
        val aluno = other as? Aluno
        return this.codigoAluno == aluno?.codigoAluno
    }

    override fun hashCode(): Int {
        return codigoAluno
    }
}