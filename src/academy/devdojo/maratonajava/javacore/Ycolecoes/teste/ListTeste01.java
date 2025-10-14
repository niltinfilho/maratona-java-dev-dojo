package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList(); // até a versão 1.4
//        nomes.add("Nilton");
//        nomes.add("Gestão Tec");
//        nomes.add(121);

//        for (Object nome : nomes) {
//            System.out.println(nome);
//        }

        List<String> nomes = new ArrayList(); // 1.5
        nomes.add("Nilton");
        nomes.add("Gestão Tec");
        nomes.remove(0);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Assunção");
        System.out.println("---------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

        List<String> nomes1 = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes1.add("Nilton");
        nomes1.add("Gestão");
        nomes2.add("Filho");
        nomes2.add("Tec");
        System.out.println(nomes1);
        nomes1.addAll(nomes2);
        System.out.println(nomes1);
    }
}
