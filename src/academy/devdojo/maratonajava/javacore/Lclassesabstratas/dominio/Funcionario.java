package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

// abstract transforma a classe em apenas um template, que nao pode instanciado
// classes abstratas foram criadas para serem extendidas
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();
}
