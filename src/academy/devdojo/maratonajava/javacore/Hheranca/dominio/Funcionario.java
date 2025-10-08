package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    // esse método sobrescreve o metodo original da classe Pessoa,
    // mas só é executado dentro do objeto Funcionario
    public void imprime() {
        super.imprime(); // e esse "super" puxa as acoes do metodo original para serem executadas aqui tbm
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
