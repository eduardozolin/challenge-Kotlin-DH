class DigitalHouseManager(
    var listaAlunos: MutableList<Aluno>,
    var listaProfessores: MutableList<Professor>,
    var listaCurso: MutableList<Curso>,
    var listaMatriculas: MutableList<Matricula>,

    var alunoExiste: Aluno,
    var cursoExiste: Curso,
    var professorTitularExiste: Professor,
    var professorAdjuntoExiste: Professor
) {
    fun registrarCurso(
        nome: String,
        codigoCurso: Int,
        professorTitular: ProfessorTitular,
        professorAdjunto: ProfessorAdjunto,
        quantidadeMaximaDeAlunos: Int
    ) {

        var curso = Curso(
            nome,
            codigoCurso,
            professorTitular,
            professorAdjunto,
            quantidadeMaximaDeAlunos
        )
        listaCurso.add(curso)
        println("Curso ${curso.nome} adicionado ao sistema.")
    }

    fun excluirCurso(codigoCurso: Int) {
        listaCurso.forEach() {
            if (codigoCurso == codigoCurso) {
                listaCurso.remove(it)
                println("Curso excluído com sucesso.")
            } else {
                println("Código de curso não localizado no sistema.")
            }
        }

    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        quantidadeDeHoras: Int
    ) {

        var professorAdjunto = ProfessorAdjunto(
            nome,
            sobrenome,
            tempoDeCasa = 0,
            codigoProfessor,
            quantidadeDeHoras,
        )

        listaProfessores.add(professorAdjunto)
        println("Professor adjunto ${professorAdjunto.nome} adicionado ao sistema.")

    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        especialidade: String
    ) {

        var professorTitular = ProfessorTitular(
            nome,
            sobrenome,
            tempoDeCasa = 0,
            codigoProfessor,
            especialidade,
        )

        listaProfessores.add(professorTitular)
        println("Professor titular ${professorTitular.nome} adicionado ao sistema.")


    }

    fun excluirProfessor(codigoProfessor: Int) {
        listaProfessores.forEach() {
            if (codigoProfessor == codigoProfessor) {
                listaProfessores.remove(it)
                println("Professor excluído com sucesso.")
            } else {
                println("Código de professor não localizado no sistema.")
            }
        }
    }

    fun registrarAluno(
        nome: String,
        sobrenome: String,
        codigoAluno: Int
    ) {
        var aluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.add(aluno)
        println("Aluno matriculado com sucesso.")
    }

    fun matricularAluno(
        codigoAluno: Int,
        codigoCurso: Int
    ) {
        listaAlunos.forEach() {
            if (it.codigoAluno == codigoAluno) {
                alunoExiste = it
            }
        }
        listaCurso.forEach() {
            if (it.codigoCurso == codigoCurso) {
                cursoExiste = it
            }
        }

        var matriculaOK = cursoExiste.adicionarUmAluno(alunoExiste)
        if (matriculaOK) {
            var matricula: Matricula = Matricula(alunoExiste, cursoExiste)
            listaMatriculas.add(matricula)
            println("Aluno ${alunoExiste.nome} com sucesso no curso ${cursoExiste.nome}.")
        } else {
            println("Matrícula não realizada, curso com vagas esgotadas.")
        }
    }

    fun alocarProfessores(
        codigoCurso: Int,
        codigoProfessorTitular: Int,
        codigoProfessorAdjunto: Int
    ) {

        listaProfessores.forEach() {
            if (it.codigoProfessor == codigoProfessorTitular) {
                professorTitularExiste = it as ProfessorTitular
            }

            if (it.codigoProfessor == codigoProfessorAdjunto) {
                professorAdjuntoExiste = it as ProfessorAdjunto
            }

            listaCurso.forEach() {
                cursoExiste.professorTitular = professorTitularExiste as ProfessorTitular
                cursoExiste.professorAdjunto = professorAdjuntoExiste as ProfessorAdjunto
            }
        }


    }
}