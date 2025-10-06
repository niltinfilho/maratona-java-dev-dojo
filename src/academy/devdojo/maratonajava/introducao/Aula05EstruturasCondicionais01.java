package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebidaAlcoolica = idade >= 18;

        if(isAutorizadoComprarBebidaAlcoolica) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("Nao autorizado a comprar bebida alcoolica");
        }

        if(!isAutorizadoComprarBebidaAlcoolica) {
            System.out.println("Nao autorizado a comprar bebida alcoolica");
        }
        System.out.println("Fora do if");
    }
}
