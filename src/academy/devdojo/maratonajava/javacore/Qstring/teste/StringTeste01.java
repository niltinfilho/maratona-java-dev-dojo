package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Nilton"; // String constant pool
        String nome2 = "Nilton";
        System.out.println(nome == nome2); // o == compara a referencia dos objetos

        System.out.println("-------------------");

        // strings são imutaveis:
        nome.concat(" Filho"); // nesse caso, nao foi adicionado " Filho" na variavel nome pois nao houve reatribuição
        System.out.println(nome == nome2);
        System.out.println(nome);

        System.out.println("-------------------");

        nome = nome.concat(" Filho"); // agora sim, a variavel foi reatribuida, por isso mudou seu valor
        System.out.println(nome == nome2);
        System.out.println(nome);
    }
}
