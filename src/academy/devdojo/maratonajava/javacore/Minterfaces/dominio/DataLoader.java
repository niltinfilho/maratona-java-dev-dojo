package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // por padrao, atributos dentro de interfaces sao publicos, estaticos e constantes
    public static final int MAX_DATA_SIZE = 10;

    // por padrao, metodos dentro de interfaces sao publicos e abstratos
    public abstract void load();

    // o default serve para criar um metodo com corpo dentro de uma interface,
    // dessa forma, as classes que implementarem essa interface *nao serao obrigados*
    // a sobrescrevem o metodo
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissoes");
    }

    // também é possivel criar um metodo estatico, ou seja, nao podem ser sobrescritos
    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
