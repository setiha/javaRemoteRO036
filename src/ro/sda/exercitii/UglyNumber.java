package ro.sda.exercitii;

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        boolean isUgly = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        while (number < 1){
            System.out.println("Enter positive number: ");
            number = scanner.nextInt();
        }

        while (number != 1) {
            if (number % 5 == 0) {
                number /= 5;
            } else if (number % 3 == 0) {
                number /= 3;
            } else if (number % 2 == 0) {
                number /= 2;
            } else {
                isUgly = false;
                break;
            }
        }

        if (isUgly) {
            System.out.println("It is an ugly number");
        } else {
            System.out.println("It is not an ugly number");
        }
    }

}
