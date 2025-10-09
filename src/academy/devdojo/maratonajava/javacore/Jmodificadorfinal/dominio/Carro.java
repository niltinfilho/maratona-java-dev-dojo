package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

// deixar uma classe como final garante que nao havera nenhuma subclasse via herança
//public final class Carro {
public class Carro {
    private String nome;
    // final -> constantes, convenção de usar o nome em capslock separado por underline
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    // um metodo modificado como final garante que ele nunca podera ser sobrescrito
    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
