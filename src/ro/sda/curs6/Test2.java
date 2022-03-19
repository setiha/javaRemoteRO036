package ro.sda.curs6;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        iterate(n);
    }

    static void iterate(int numberFromUser) {

        for (int i = 1; i <= numberFromUser; i++) {
            String star = "*";
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(star);
            }
        }
    }
}

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int nrOfRows = scanner.nextInt();
        while (nrOfRows < 1) {
            System.out.println("Number of rows must be greater or equal to 1");
            System.out.print("Number of rows: ");
            nrOfRows = scanner.nextInt();
        }
        for (int i = 1; i <= nrOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }*/