package ro.sda.curs6;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti o valoare");

        float diametru = scanner.nextFloat();
        float rezultat = (float)(diametru * 3.14);
        System.out.println(rezultat);

        float rezultat2 = (float) Math.PI * diametru;
        System.out.println(rezultat2);
    }
}
