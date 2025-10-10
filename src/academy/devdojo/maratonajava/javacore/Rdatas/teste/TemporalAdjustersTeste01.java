package academy.devdojo.maratonajava.javacore.Rdatas.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
//        now = now.withDayOfMonth(20);
        now = now.with(ChronoField.DAY_OF_MONTH, 10);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("----------------------------");

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("----------------------------");

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("----------------------------");

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("----------------------------");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("----------------------------");

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("----------------------------");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("----------------------------");
    }
}
