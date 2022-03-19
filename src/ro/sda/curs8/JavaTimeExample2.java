package ro.sda.curs8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class JavaTimeExample2 {

    public static void main(String[] args) {

        // cannot be used with time
       /* Period period = Period
                .between(LocalDate.now()
                        .plusYears(5)
                        .plusDays(1)
                        .plusMonths(2), LocalDate.now());
        System.out.println(period);*/

        /*Duration duration = Duration.between(LocalTime.now().plusHours(1).plusMinutes(15), LocalTime.now());
        System.out.println(duration);*/

       /* LocalDate localDate = LocalDate.of(1977, 10, 28);
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate.minusYears(20);
        System.out.println(localDate);
        System.out.println(localDate2);
        LocalDate from = LocalDate.of(2020, 5, 4);
        LocalDate to = LocalDate.of(2020, 10, 10);

        Period period = Period.between(from, to);
        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");*/

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1960, 1, 1);
        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.YEARS.between(birthday, today);
        System.out.println(p.getDays());
        System.out.println(p.getDays());
        System.out.println(today.getYear());
    }
}