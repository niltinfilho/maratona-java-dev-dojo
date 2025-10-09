package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

// quando ha heranca de outra classe usa-se extends
// já quando se trata de interfaces usa-se implements
// outra vantagem é poder implementar 2 ou mais interfaces, diferentemente da heranca de classes
public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");

    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no banco de dados");
    }

    // esse metodo nao esta sobrescresvendo o metodo da interface DataLoader, sao coisas diferentes.
    // aquele metodo ainda continua sendo executado, ao mesmo tempo que esse tambem pode ser executado.
    // sao metodos diferentes, mas com o mesmo nome -> nao ha sobrescrita
    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader");
    }
}