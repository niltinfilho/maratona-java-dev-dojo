package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String primeiraPalavra = entrada.next(); // .next() só lê a primeira palavra
        System.out.println(primeiraPalavra);

        System.out.print("Digite outro texto: ");
        String textoCompleto = entrada.nextLine(); // .nextLine() lê tudo
        System.out.println(textoCompleto);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt(); // .nextInt() lê numero inteiro
        System.out.println(idade);

        System.out.print("Digite seu sexo: ");
        char sexo = entrada.next().charAt(0); // .next().charAt(0) transforma string em uma lista, onde cada letra se torna um elemento, e guarda o valor do elemento na posicao 0
        System.out.println(sexo);
    }
}
