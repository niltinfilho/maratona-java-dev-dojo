package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Macbook air m4", 12000);
        Tomate tomate = new Tomate("Tomate vermelho", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("_-----------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
