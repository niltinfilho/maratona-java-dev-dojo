package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double -> 0
        // char -> '\u0000' ''
        // boolean -> false
        // String -> null
        byte [] idades = new byte[3];
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        char [] idades1 = new char[3];
        System.out.println(idades1[0]);
        System.out.println(idades1[1]);
        System.out.println(idades1[2]);

        boolean [] idades2 = new boolean[3];
        System.out.println(idades2[0]);
        System.out.println(idades2[1]);
        System.out.println(idades2[2]);

        String [] idades3 = new String[3];
        System.out.println(idades3[0]);
        System.out.println(idades3[1]);
        System.out.println(idades3[2]);
    }
}
