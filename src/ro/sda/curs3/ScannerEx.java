package ro.sda.curs3;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String textLine = scan.nextLine();
        Double nextDouble = scan.nextDouble();
        Boolean nextBoolean = scan.nextBoolean();

        System.out.println(textLine);
        System.out.println(nextDouble);
        System.out.println(nextBoolean);
    }
}
