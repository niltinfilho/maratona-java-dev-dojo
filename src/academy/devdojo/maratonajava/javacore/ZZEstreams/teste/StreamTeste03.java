package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTeste03 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William Suane", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo", "Mendes", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        devdojo.stream()
                .flatMap(Collection::stream).forEach(System.out::println);
    }
}
