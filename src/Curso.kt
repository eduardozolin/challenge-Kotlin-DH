class Curso(
    var nome: String,
    var codigoCurso: Int,
    var professorTitular: ProfessorTitular,
    var professorAdjunto: ProfessorAdjunto,
    var quantidadeMaximaDeAlunos: Int,
    val listaAlunos: MutableList<Aluno> = mutableListOf<Aluno>()
) {
    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return true
    }

    fun excluirAluno(umAluno: Aluno): Boolean{
        return true
    }
}