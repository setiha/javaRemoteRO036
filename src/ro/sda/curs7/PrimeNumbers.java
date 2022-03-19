package ro.sda.curs7;

import java.util.Scanner;

public class PrimeNumbers {
    static void primCheck(int checkNumber) {
        extraction(checkNumber);
    }

    public static void extraction(int checkNumber) {
        if (checkNumber == 0) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        for (int i = 1; i <= checkNumber; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter = counter + 1;
                }

            }

            if (counter <= 2) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fromUser = scanner.nextInt();
        primCheck(fromUser);
    }
}
