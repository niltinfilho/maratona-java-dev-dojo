package academy.devdojo.maratonajava.javacore.Csobrecargademetodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargademetodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setNome("Akudama Drive");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive", "TV", 12, "Ação");
//        anime.setGenero("Ação");
        anime.imprime();
    }
}
