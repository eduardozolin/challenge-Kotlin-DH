class DigitalHouseManager(
    var listaAlunos: ArrayList<Int> = arrayListOf(),
    var listaProfessores: ArrayList<Int> = arrayListOf(),
    var listaCurso: ArrayList<Int> = arrayListOf(),
    var listaMatriculas: ArrayList<Int> = arrayListOf()
) {
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {

    }

    fun excluirCurso(codigoCurso: Int) {

    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        quantidadeDeHoras: Int
    ) {

    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        especialidade: String
    ) {

    }

    fun excluirProfessor(codigoProfessor: Int) {

    }

    fun matricularAluno(
        nome: String,
        sobrenome: String,
        codigoAluno: Int
    ) {

    }

    fun matricularAluno(
        codigoAluno: Int,
        codigoCurso: Int
    ) {

    }

    fun alocarProfessores(
        codigoCurso: Int,
        codigoProfessorTitular: Int,
        codigoProfessorAdjunto: Int
    ) {

    }
}