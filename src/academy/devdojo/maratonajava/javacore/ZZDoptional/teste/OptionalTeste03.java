package academy.devdojo.maratonajava.javacore.ZZDoptional.teste;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.List;
import java.util.Optional;

public class OptionalTeste03 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle(m.getTitle() + " 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElse(new Manga(3, "Drifters", 20));
        System.out.println(newManga);
    }
}
