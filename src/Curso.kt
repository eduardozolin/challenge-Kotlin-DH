class Curso(
    var nome: String,
    var codigoCurso: Int,
    var professorTitular: ProfessorTitular,
    var professorAdjunto: ProfessorAdjunto,
    var quantidadeMaximaDeAlunos: Int,
    val listaAlunos: MutableList<Aluno> = mutableListOf<Aluno>()
) {
    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (listaAlunos.size < quantidadeMaximaDeAlunos) {
            listaAlunos.add(umAluno)
            println("Aluno matriculado no curso.")
            return true
        } else {
            println("Aluno não pode ser matriculado no curso.")
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno): Boolean{
        listaAlunos.remove(umAluno)
        println("Aluno excluído do curso.")
        return true
    }

    override fun equals(other: Any?): Boolean {
        val curso = other as? Curso
        return this.codigoCurso == curso?.codigoCurso
    }
}