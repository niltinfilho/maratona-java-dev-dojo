package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

public class OuterClassesTeste01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassesTeste01 outerClass = new OuterClassesTeste01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTeste01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
