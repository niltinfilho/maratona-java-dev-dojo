package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Supra Mk4", 275);
        Carro carro3 = new Carro("GT-R Skyline", 320);

        // Ele nao muda a velocidade de um carro em especifico, ele muda a velocidade do "molde" que faz o carro, ou seja, todos
        Carro.velocidadeLimite = 180;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
