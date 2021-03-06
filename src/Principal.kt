fun main() {

    val professorTitular1 = ProfessorTitular(
        "Cesar",
        "Rodrigues",
        5,
        1001,
        "Android"
    )

    val professorTitular2 = ProfessorTitular(
        "Eduardo",
        "Misina",
        3,
        2001,
        "Java"
    )

    val professorAdjunto1 = ProfessorAdjunto(
        "Bruce",
        "Wayne",
        1,
        9991,
        60
    )

    val professorAdjunto2 = ProfessorAdjunto(
        "Clark",
        "Kent",
        9,
        9999,
        300
    )

    val curso1 = Curso(
        "Full Stack",
        20001,
        professorTitular1,
        professorAdjunto1,
        3,
    )

    val curso2 = Curso(
        "Android",
        20002,
        professorTitular2,
        professorAdjunto2,
        2,
    )

    var aluno1 = Aluno("Tony", "Stark", 5555)
    var aluno2 = Aluno("Steve", "Rodgers", 5444)
    var aluno3 = Aluno("Peter", "Parker", 5333)


    curso1.professorTitular = professorTitular1
    curso1.professorAdjunto = professorAdjunto1

    curso2.professorTitular = professorTitular2
    curso2.professorAdjunto = professorAdjunto2

    curso1.adicionarUmAluno(aluno1)
    curso1.adicionarUmAluno(aluno2)

    curso2.adicionarUmAluno(aluno1)
    curso2.adicionarUmAluno(aluno2)
    curso2.adicionarUmAluno(aluno3)
}