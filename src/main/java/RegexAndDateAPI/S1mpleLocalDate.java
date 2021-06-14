package RegexAndDateAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class S1mpleLocalDate {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        System.out.println("==========================");

        LocalDateTime fromLocalTime = localTime.atDate(localDate);
        LocalDateTime fromDateTime = localDate.atTime(localTime);

        System.out.println(fromLocalTime);
        System.out.println(fromDateTime);

        System.out.println("==============================");

        fromDateTime = localDate.atTime(12, 0,57, 1);
        System.out.println(fromDateTime);

        System.out.println("============================");
        localDate = localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
        System.out.println(localDate);


    }
}
