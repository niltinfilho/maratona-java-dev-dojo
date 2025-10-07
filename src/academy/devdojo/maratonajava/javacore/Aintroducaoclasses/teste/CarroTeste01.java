package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        carro2.nome = "Golzin Quadrado Escape Direto";
        carro2.modelo = "Gol Quadrado";
        carro2.ano = 1987;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\n"+carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
