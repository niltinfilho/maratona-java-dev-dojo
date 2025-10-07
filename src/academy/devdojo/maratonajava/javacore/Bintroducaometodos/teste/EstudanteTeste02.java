package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Igor Yoshimitsu";
        estudante01.idade = 25;
        estudante01.sexo = 'M';

        estudante02.nome = "Gabriel Fukasawa";
        estudante02.idade = 29;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
