package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Igor Yoshimitsu";
        estudante01.idade = 25;
        estudante01.sexo = 'M';

        estudante02.nome = "Gabriel Fukasawa";
        estudante02.idade = 29;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        System.out.println("------------------");
        impressora.imprime2(estudante01);
        impressora.imprime2(estudante02);
    }
}
