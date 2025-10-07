package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double salarioTotal;

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

        for (double salario : this.salarios) {
            salarioTotal += salario;
        }
        double media = salarioTotal / this.salarios.length;
        System.out.println("A média do salário é R$" + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
}
