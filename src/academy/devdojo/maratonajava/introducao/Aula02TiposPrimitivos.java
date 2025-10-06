package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos
        // int, double, float, char, byte, short, long, boolean
        byte idadeByte = -128; // 1 byte -> -128 a 127
        short idadeShort = 32767; // 2 bytes -> -32.768 a 32.767
        int idade = 10;
        long numeroGrande = 100000;
        int castingInt = (int) 10000000000L; // casting -> long forçado a caber dentro de um int | o java quebra os bits para fazer caber
        float salarioFloat = 2500.0F;
        double salarioDouble = 2000.0;
        float castingFloat = (float) 2500.0D;  // casting -> double forçado a caber dentro de um float | nesse caso coube
        boolean verdadeiro = true;
        boolean falso = false;
        char caractereLetra = 'M';
        char caractereAscii = 78;
        char caractereUnicode = '\u004E';

        System.out.println("A idade é " + idade + " anos");
        System.out.println("boolean: " + verdadeiro);
        System.out.println("caractere letra: " + caractereLetra);
        System.out.println("caractere ascii: " + caractereAscii);
        System.out.println("caractere unicode: " + caractereUnicode);
        System.out.println("casting para int: " + castingInt);
        System.out.println("casting para float: " + castingFloat);

        // Tipo referencial
        String texto = "Um graaaaande texto, sem necessariamente um limite";
        System.out.println("String: " + texto);
    }
}
