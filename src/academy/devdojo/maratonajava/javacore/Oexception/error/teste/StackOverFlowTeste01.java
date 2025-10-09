package academy.devdojo.maratonajava.javacore.Oexception.error.teste;

public class StackOverFlowTeste01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
