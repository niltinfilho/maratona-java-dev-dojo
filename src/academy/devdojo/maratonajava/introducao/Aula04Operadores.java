package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        // O operador de adição (+) é sobrecarregado, ou seja,
        // realiza diferentes tipos de operação (soma e concatenação)
        System.out.println(numero02 + numero01);
        System.out.println("numero02" + "numero01");
        System.out.println("valor" + numero02 + numero01);
        System.out.println(numero02 + numero01 + "valor" + numero02 + numero01);

        double resultado = numero02 * numero01;
        System.out.println("Multiplicacao: " + resultado);
        resultado = numero02 / numero01; // mesmo a variavel resultado sendo do tipo double, as duas variaveis que
        // estao na operacao sao do tipo inteiro, logo o resultado dessa operacao tambem vai ser do tipo inteiro
        System.out.println("Divisao int: " + resultado);
        int numero03 = 20;
        double numero04 = 10;
        resultado = numero04 / numero03; // agora um dos valores é do tipo double, entao o resultado vai ser double
        System.out.println("Divisao double: " + resultado);

        // % -> resto da divisao
        int resto = 21 % 7;
        System.out.println("resto da divisao: " + resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);

        boolean isDezIgualDez = 10 == 10;
        System.out.println("isDezIgualDez: " + isDezIgualDez);

        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("isPlayStationCincoCompravel: " + isPlayStationCincoCompravel);
    }
}
