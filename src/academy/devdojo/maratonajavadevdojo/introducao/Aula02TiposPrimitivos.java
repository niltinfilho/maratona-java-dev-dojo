package academy.devdojo.maratonajavadevdojo.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 10;
        int numeroLong = (int) 10000000000L; // -> o valor digitado foi long, fazendo um casting para int
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127; // -> -128 a 127
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87; // 87 = W (ASCII)
        String texto = "Aqui cabe um graaaaaaande texto";

        System.out.println(idade);
        System.out.println("A idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char: " + caractere);
        System.out.println(numeroLong);
        System.out.println(texto);
    }
}
