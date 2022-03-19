package ro.sda.curs8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaTimeExample4 {
    public static void main(String[] args) {
        String localDateAsString1 = "17/01/2022";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(localDateAsString1, dateTimeFormatter1);

        System.out.println(localDate);


        //String localDateAsString2 = "17.01.2022";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti o data pe urmatorul format: dd...MM...yyyy");
        String localDateAsString2 = scanner.nextLine();

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd...MM...yyyy");
        LocalDate localDate2 = LocalDate.parse(localDateAsString2, dateTimeFormatter2);

        System.out.println(localDate2.getDayOfMonth());

    }
}
