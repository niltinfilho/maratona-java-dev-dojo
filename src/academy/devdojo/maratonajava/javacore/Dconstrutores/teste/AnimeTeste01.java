package academy.devdojo.maratonajava.javacore.Dconstrutores.teste;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação");
        anime.imprime();

        Anime anime2 = new Anime();
        anime2.imprime();
    }
}
