package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    // sobrescrevendo o método toString
    @Override // somente uma anotação (nesse caso), para garantir que esta sobrescrevendo
    public String toString() {
        return "Anime: " + this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
