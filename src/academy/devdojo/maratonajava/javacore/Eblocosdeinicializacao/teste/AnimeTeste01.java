package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.teste;

import academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto Dragon Ball");
        Anime anime2 = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
        for (int episodio : anime2.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
