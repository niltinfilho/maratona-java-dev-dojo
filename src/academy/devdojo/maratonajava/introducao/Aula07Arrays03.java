package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String [] nomes = new String[3];
        // o tamanho do array não pode mudar dinamicamente, em tempo de execução
        nomes[0] = "Nilton";
        nomes[1] = "Eduarda";
        nomes[2] = "Arthur";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        // nomes = new String[3]; -> ele apaga a referencia anterior e cria uma nova vazia
    }
}
