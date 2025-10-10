package academy.devdojo.maratonajava.javacore.Pwrapper.teste;

public class WrapperTeste01 {
    public static void main(String[] args) {
        // tipos primitivos -> quantidade de bits que esta alocando na memoria
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // transforma em objetos -> aplica o polimorfismo
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // boxing ou auto boxing -> primitivo para wrapper
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing -> wrapper para primitivo
        Integer intW2 = Integer.parseInt("1");
        System.out.println("ParseBoolean: " + Boolean.parseBoolean("1"));
        System.out.println("Character.isDigit: " + Character.isDigit('A'));
        System.out.println("Character.isDigit: " + Character.isDigit('9'));
        System.out.println("Character.isLetterOrDigit: " + Character.isLetterOrDigit('!'));
        System.out.println("isUpperCase: " + Character.isUpperCase('a'));
        System.out.println("isLowerCase: " + Character.isLowerCase('A'));
        System.out.println("toUpperCase: " + Character.toUpperCase('a'));
        System.out.println("toLowerCase: " + Character.toLowerCase('A'));
    }
}
