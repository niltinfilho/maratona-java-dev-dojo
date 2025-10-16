package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeste02 {
    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
//        long count1 = stream.filter(ln -> ln.getPrice() <= 4).count();
//        long count2 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4).count();
        long count = stream.distinct().filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);
//        System.out.println(count1);
//        System.out.println(count2);
    }

    private static List<LightNovel> lightNovels = List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    );
}
