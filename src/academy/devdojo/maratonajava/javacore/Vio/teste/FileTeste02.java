package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("isDiretorioCreated: " + isDiretorioCreated);

//        File fileArquivoDiretorio = new File("C:\\Users\\Home\\Desktop\\DevDojo\\maratona-java-dev-dojo\\pasta\\arquivo.txt");
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("isFileCreated: " + isFileCreated);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("isRenamed: " + isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("isDiretorioRenamed: " + isDiretorioRenamed);
    }
}
