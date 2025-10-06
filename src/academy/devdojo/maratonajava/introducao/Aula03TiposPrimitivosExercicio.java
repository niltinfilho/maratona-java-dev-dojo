package academy.devdojo.maratonajava.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <>
e imprima a seguinte mensagem:
Eu, <nome>, morando no endereço <endereço>, confirmo
que recebi o salário de R$<salario> na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Nilton";
        String endereco = "Rua Rio Preto - 310";
        float salario = 1100.00F;
        String dataRecebimentoSalario = "06/10/2025";

        String mensagem = "Eu, " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$" + salario + " na data " + dataRecebimentoSalario;
        System.out.println(mensagem);
    }
}
