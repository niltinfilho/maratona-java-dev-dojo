package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "       Luffy      ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "L"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3, numeros.length()));
        System.out.println(nome.trim()); // remove os espaços em branco no inicio e no fim
    }
}
