package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

public class OuterClassesTeste02 {
    private String name = "Midoriya";

    void print() {
        String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }

        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTeste02 outer = new OuterClassesTeste02();
        outer.print();
    }
}
