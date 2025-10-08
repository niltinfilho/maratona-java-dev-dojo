package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Random;
import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("O grande software de previsão do futuro");
        System.out.print("Digite sua pergunta e responderei sim ou não: ");
        String pergunta = input.nextLine();

        if(random.nextInt() % 2 == 0) {
            System.out.println("Definitivamente sim!!!");
        } else {
            System.out.println("Obviamente que não...");
        }
    }
}
