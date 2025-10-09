package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    public static final double IMPOSTO_POR_CENTO = 0.21;

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisao");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
