package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Gilberto";
        funcionario.idade = 57;
        funcionario.salarios = new double[]{1567, 2412.45, 3092.12};

        funcionario.imprime();
    }
}
