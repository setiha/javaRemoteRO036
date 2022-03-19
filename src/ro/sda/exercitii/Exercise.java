package ro.sda.exercitii;

import java.time.LocalDate;
import java.time.LocalTime;

public class Exercise {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime);
        LocalTime localTime1 = LocalTime.now();
        localTime1.getHour();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfMonth());

    }
}
