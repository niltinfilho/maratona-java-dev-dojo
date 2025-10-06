package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        byte idadeByte = -128; // 1 byte -> -128 a 127
        short idadeShort = 32767; // 2 bytes -> -32.768 a 32.767
        int idade = 10;
        long numeroGrande = 100000;
        float salarioFloat = 2500;
        double salarioDouble = 2000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractereLetra = 'M';
        char caractereAscii = 78;
        char caractereUnicode = '\u004E';

        System.out.println("A idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println(caractereLetra);
        System.out.println(caractereAscii);
        System.out.println(caractereUnicode);
    }
}
