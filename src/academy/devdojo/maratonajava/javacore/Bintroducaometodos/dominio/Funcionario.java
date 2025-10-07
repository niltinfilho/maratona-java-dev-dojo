package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        if (salarios == null){
            return;
        }
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double salario : this.salarios) {
            System.out.println("R$" + salario);
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }
        double salarioTotal = 0;
        for (double salario : this.salarios) {
            salarioTotal += salario;
        }
        double media = salarioTotal / this.salarios.length;
        System.out.println("A média do salário é R$" + media);
    }
}
