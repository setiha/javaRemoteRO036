package ro.sda.curs6;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar pozitiv");
        int number = scanner.nextInt();
        int suma = 0;
        while (number != 0) {
            int rest = number % 10;
            suma = suma + rest;
            number = number / 10;
        }
        System.out.println(suma);

    }
}
