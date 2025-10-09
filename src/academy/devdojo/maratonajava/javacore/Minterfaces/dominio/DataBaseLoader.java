package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

// quando ha heranca de outra classe usa-se extends
// já quando se trata de interfaces usa-se implements
public class DataBaseLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
}