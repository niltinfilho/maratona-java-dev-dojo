package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

        Carro carro = rentalServiceCarro.buscarVeiculoDisponivel();
        System.out.println("Usando o carro por um mes");
        rentalServiceCarro.retornarVeiculoAlugado(carro);

        System.out.println("==========================");

        Barco barco = rentalServiceBarco.buscarVeiculoDisponivel();
        System.out.println("Usando o carro por um mes");
        rentalServiceBarco.retornarVeiculoAlugado(barco);
    }
}
