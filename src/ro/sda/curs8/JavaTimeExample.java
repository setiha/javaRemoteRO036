package ro.sda.curs8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;

public class JavaTimeExample {
    public static void main(String[] args) {

        // package -> java.time
        // date -> LocalDate
        //time -> LocalTime
        // date and time -> LocalDateTime


        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date currentDate: " + currentDate);
        LocalDate currentDateV2 = LocalDate.of(1994, 1, 12);
        System.out.println("Current date currentDateV2: " + currentDateV2);

        LocalTime localTime = LocalTime.now();
        System.out.println("Current time1: " + localTime);
        LocalTime localTime1 = LocalTime.of(11, 32);
        System.out.println("Current time2: " + localTime1);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current localDateTime: " + localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(currentDate, localTime);
        System.out.println("Current localDateTime1: " + localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, 3, 12, 11, 34, 15, 11);
        System.out.println("Current localDateTime2: " + localDateTime2);

        System.out.println("Day of the week is:" + currentDateV2.getDayOfWeek());
        System.out.println("Day of the month is:" + currentDate.getDayOfMonth());
    }
}
