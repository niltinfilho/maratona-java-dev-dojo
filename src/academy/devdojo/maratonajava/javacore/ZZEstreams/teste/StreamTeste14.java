package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTeste14 {
    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, List<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTeste14::getPromotion, Collectors.toList())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTeste14::getPromotion, Collectors.toSet())));
        System.out.println(collect2);

        Map<Category, LinkedHashSet<Promotion>> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTeste14::getPromotion,
                                Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect3);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }

    private static List<LightNovel> lightNovels = List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    );
}
