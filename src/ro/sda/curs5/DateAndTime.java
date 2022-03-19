package ro.sda.curs5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTime {
    public static void main(String[] args) {
        LocalTime localTimeBefore = LocalTime.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(localTimeBefore);
        System.out.println(localTime);
        System.out.println(localTimeBefore.isBefore(localTime));
        var primaInst = System.nanoTime();
        var a2Inst = System.nanoTime();
        System.out.println(primaInst);
        System.out.println(Duration.ofSeconds(61).toMinutes());
        Month localDate = LocalDateTime.now().getMonth();
        System.out.println(localDate);
    }

}
