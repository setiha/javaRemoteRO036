package ro.sda.curs5;

import ro.sda.curs7.PrimeNumbers;

import java.util.Scanner;

public class task4 {

    static int findSmallNumber(int... numbers) {
        int acc = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (acc > i) {
                acc = numbers[i];
            }
        }
        return acc;
    }

    static int findBigNumber(int... numbers) {
        int acc = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (acc < i) {
                acc = numbers[i];
            }
        }
        return acc;
    }

    static int sum(int... numbers) {
        int celMaiMicNr = findSmallNumber(numbers);
        int celMaiMare = findBigNumber(numbers);
        return celMaiMare + celMaiMicNr;
    }

    static double medie(int... numbers) {
        return sum(numbers) / 2.0;
    }

    static void primCheck(int checkNumber) {
        PrimeNumbers.extraction(checkNumber);
    }

    static Scanner newScan = new Scanner(System.in);
    static int fromUser = newScan.nextInt();

    public static void main(String[] args) {
        primCheck(fromUser);

        byte y = (byte)888888;
        int x = (int)y;
        int truncated = (int)0.99;
        char a = 'a';
        int b = (int) a;
        System.out.println(b);
       /* System.out.println(findSmallNumber(1, 2, 3));
        System.out.println(findBigNumber(1, 2, 3));
        System.out.println(sum(1, 2, 3));*/
        /*for (int i = 1; i <= fromUser; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Fizz Buzz");
            } else {
                System.out.println(i);
            }
        }*/
    }
}
