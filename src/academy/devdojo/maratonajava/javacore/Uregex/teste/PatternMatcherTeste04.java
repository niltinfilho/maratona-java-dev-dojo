package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste04 {
    public static void main(String[] args) {
        // ? -> Zero ou uma
        // * -> Zero ou mais
        // + -> Uma ou mais
        // {n,m} -> de n até m
        // () -> agrupamento
        // | -> ou, ex: o(v|c)o -> ovo ou oco
        // $ -> final da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        // começa com 0, seguido por x ou X, depois aceita de 0 a 9, de a a f ou A a F, seguido por um espaço em branco ou final da linha
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
