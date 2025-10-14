package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>(); // FIFO - first in first out
        fila.add("C");
        fila.add("A");
        fila.add("B");

//        for (String s : fila) {
//            System.out.println(s);
//        }

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
