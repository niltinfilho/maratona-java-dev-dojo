package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste02 {
    public static void main(String[] args) {
        Carro carro3 = new Carro();
        Carro carro4 = new Carro();

        carro3.nome = "Fusca";
        carro3.modelo = "Sport";
        carro3.ano = 1969;

        carro4.nome = "Golzin Quadrado Escape Direto";
        carro4.modelo = "Gol Quadrado";
        carro4.ano = 1987;

        carro3 = carro4;

        System.out.println(carro3.nome);
        System.out.println(carro3.modelo);
        System.out.println(carro3.ano);

        System.out.println("\n"+carro4.nome);
        System.out.println(carro4.modelo);
        System.out.println(carro4.ano);
    }
}
