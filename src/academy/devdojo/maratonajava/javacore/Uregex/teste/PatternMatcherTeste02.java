package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        // \d -> Todos os dígitos
        // \D -> Tudo que NÃO for dígito
        // \s -> Espaços em branco (\t, \n, \f, \r, )
        // \S -> Todos os caracteres excluindo os brancos
        // \w -> Tudo de a-z ou A-Z, dígitos, _ (basicamente exclui os caracteres especiais)
        // \W -> Apenas os caracteres especiais
        String regex = "\\W";
        String texto2 = "@#hh_j2 1\t2gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
