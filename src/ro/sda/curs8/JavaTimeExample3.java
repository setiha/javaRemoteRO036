package ro.sda.curs8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JavaTimeExample3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // default format: yyyy-MM-dd

        // change format to: dd.MM.yyyy

       /* DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd ---- MM ~~~~ yyyy");
        String localDateFormatted = localDate.format(dateFormatter);
        System.out.println(localDateFormatted);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // default format: hh:mm:ss.nn

        // change format to: hh-mm

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh-mm");
        String timeFormatted = localTime.format(timeFormatter);
        System.out.println(timeFormatted);

        LocalDateTime localDateTime = LocalDateTime.now(); // yyyy-MM-ddThh:mm:ss.nn*/
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy  MM");
        String timeFormatted = localDate.format(dateFormatter);
        System.out.println(timeFormatted);
    }
}

