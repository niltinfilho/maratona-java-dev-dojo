package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

// abstract transforma a classe em apenas um template, que nao pode instanciado
// classes abstratas foram criadas para serem extendidas
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    // Esse metodo imprime() foi criado na superclasse Pessoa, no qual essa classe
    // Funcionario se extendeu. Como a classe pai (abstrata) criou um metodo abstrato,
    // alguem precisa obrigatoriamente implementa-lo, as proximas classes que extendem
    // a classe pai, se forem abstratas, nao precisam implementar, mas a proxima classe
    // concreta que existir, vai ser obrigada a implementar esse metodo. Nesse caso,
    // a classe Pessoa tem 1 filho (Funcionario) e 2 netos (Gerente e Desenvolvedor),
    // sendo Funcionario também abstrato, mas com esse metodo sobrescrito, entao os netos
    // ficam de boa, nao precisam implementar, apenas sobrescrever se preciso.
    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
