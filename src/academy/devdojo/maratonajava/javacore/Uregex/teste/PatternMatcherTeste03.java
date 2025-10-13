package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste03 {
    public static void main(String[] args) {
        // [] -> range
        String regex = "[abcABC]";
        String regex2 = "[a-zA-C]"; // minusculas de A a Z, e maiusculas de A a C
        String regex3 = "0[xX][0-9a-fA-F]";
        String texto = "cafeBABE";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        int numeroHex = 0x59F86A; // números hexadecimais
        System.out.println(numeroHex);
    }
}
