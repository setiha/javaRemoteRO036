package ro.sda.curs8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class LocalDateTime {
    public static void main(String[] args) {

        // cannot be used with time
        Period period = Period.between(LocalDate.now().plusYears(5).plusDays(1).plusMonths(2), LocalDate.now());
        System.out.println(period);

        Duration duration = Duration.between(LocalTime.now().plusHours(1).plusMinutes(15), LocalTime.now());
        System.out.println(duration);



    }
}
