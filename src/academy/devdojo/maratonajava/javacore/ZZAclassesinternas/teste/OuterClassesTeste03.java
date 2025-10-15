package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

public class OuterClassesTeste03 {
    private String name = "Nilton";

    static class Nested {
        private String lastName = "Filho";

        void print() {
//            System.out.println(name); -> nao tem acesso ao name
            System.out.println(new OuterClassesTeste03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
