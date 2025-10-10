package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arqivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // sempre será executado, independente do resultado do try catch
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arqivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } finally { // sempre será executado, independente do resultado do try catch
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
