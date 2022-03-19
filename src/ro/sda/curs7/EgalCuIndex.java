package ro.sda.curs7;

import java.util.Scanner;

public class EgalCuIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti dimensiunea: ");
        int vectorSize = scanner.nextInt();

        int[] vector = new int[vectorSize];
        for (int i = 0; i < vectorSize; i++) {
            int number = scanner.nextInt();
            vector[i] = number;
        }

        System.out.println();
        for (int i = 0; i < vectorSize; i++) {
            if (vector[i] == i) {
                System.out.print(vector[i] + " ");
            }
        }
    }
}
