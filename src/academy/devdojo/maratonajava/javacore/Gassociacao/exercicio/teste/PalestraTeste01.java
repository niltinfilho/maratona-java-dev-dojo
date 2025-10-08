package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

public class PalestraTeste01 {
    public static void main(String[] args) {
        Aluno alunoPedro = new Aluno("Pedro", 20);
        Aluno alunoNilton = new Aluno("Nilton", 21);
        Aluno alunoGabriel = new Aluno("Gabriel", 22);
        Aluno alunoMatheus = new Aluno("Matheus", 23);
        Aluno alunoMurilo = new Aluno("Murilo", 18);
        Aluno alunoIgor = new Aluno("Igor", 25);

        Professor professorJorge = new Professor("Jorge", "Java");
        Professor professoraAdriana = new Professor("Adriana", "Agro");
        Professor professorAndre = new Professor("Andre", "IA");

        Seminario seminarioIA = new Seminario("Inteligencia Artificial", "Jales");
        Seminario seminarioJava = new Seminario("Aprenda Java", "Fernandopolis");
        Seminario seminarioAgro = new Seminario("Vamos plantar as coisas", "Urania");

        Aluno[] alunosAgro = new Aluno[]{alunoPedro};
        Aluno[] alunosJava = new Aluno[]{alunoNilton, alunoMurilo};
        Aluno[] alunosIA = new Aluno[]{alunoGabriel, alunoMatheus, alunoIgor};

        alunoPedro.setSeminario(seminarioAgro);
        alunoNilton.setSeminario(seminarioJava);
        alunoMurilo.setSeminario(seminarioJava);
        alunoGabriel.setSeminario(seminarioIA);
        alunoMatheus.setSeminario(seminarioIA);
        alunoIgor.setSeminario(seminarioIA);

        Seminario[] seminariosJorge = new Seminario[]{seminarioIA, seminarioJava};
        Seminario[] seminariosAdriana = new Seminario[]{seminarioAgro};
        Seminario[] seminariosAndre = new Seminario[]{seminarioAgro, seminarioIA, seminarioJava};
        Professor[] professoresAgro = new Professor[]{professoraAdriana, professorAndre};
        Professor[] professoresJava = new Professor[]{professorJorge, professorAndre};
        Professor[] professoresIA = new Professor[]{professorJorge, professorAndre};

        professorJorge.setSeminarios(seminariosJorge);
        professoraAdriana.setSeminarios(seminariosAdriana);
        professorAndre.setSeminarios(seminariosAndre);

        seminarioAgro.setAlunos(alunosAgro);
        seminarioAgro.setProfessores(professoresAgro);
        seminarioJava.setAlunos(alunosJava);
        seminarioJava.setProfessores(professoresJava);
        seminarioIA.setAlunos(alunosIA);
        seminarioIA.setProfessores(professoresIA);

        alunoPedro.imprimirAluno();
        alunoNilton.imprimirAluno();
        alunoMurilo.imprimirAluno();
        alunoGabriel.imprimirAluno();
        alunoMatheus.imprimirAluno();
        alunoIgor.imprimirAluno();

        professorJorge.imprimirProfessor();
        professoraAdriana.imprimirProfessor();
        professorAndre.imprimirProfessor();

        seminarioAgro.imprimirSeminario();
        seminarioJava.imprimirSeminario();
        seminarioIA.imprimirSeminario();
    }
}
