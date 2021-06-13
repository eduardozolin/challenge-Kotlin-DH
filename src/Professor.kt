open class Professor(
    nome: String,
    sobrenome: String,
    var tempoDeCasa: Int,
    var codigoProfessor: Int
) : Pessoa(nome, sobrenome) {

    override fun equals(other: Any?): Boolean {
        val professor = other as? Professor
        return this.codigoProfessor == professor?.codigoProfessor
    }
}