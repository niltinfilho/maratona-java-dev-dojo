package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // por padrao, metodos dentro de interfaces sao publicos e abstratos
    void load();

    // o default serve para criar um metodo com corpo dentro de uma interface,
    // dessa forma, as classes que implementarem essa interface *nao serao obrigados*
    // a sobrescrevem o metodo
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissoes");
    }
}
