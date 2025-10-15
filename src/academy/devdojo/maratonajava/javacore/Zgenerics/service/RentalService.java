package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> veiculosDisponiveis;

    public RentalService(List<T> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public T buscarVeiculoDisponivel() {
        System.out.println("Buscando veiculo disponível...");
        T t = veiculosDisponiveis.remove(0);
        System.out.println("Alugando veiculo: " + t);
        System.out.println("Veiculos disponíveis para alugar: ");
        System.out.println(veiculosDisponiveis);
        return t;
    }

    public void retornarVeiculoAlugado(T t) {
        System.out.println("Devolvendo carro " + t);
        veiculosDisponiveis.add(t);
        System.out.println("Veiculos disponiveis para alugar: ");
        System.out.println(veiculosDisponiveis);
    }
}
