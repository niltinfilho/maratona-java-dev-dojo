package academy.devdojo.maratonajava.javacore.Rdatas.teste;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L); // conta o tempo em milisegundos usando long desde 01 jan 1970
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
