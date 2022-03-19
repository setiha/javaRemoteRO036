package ro.sda.curs7;

import java.util.Scanner;

public class AritmeticaValorilor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea vectorului");
        int vectorSize = scanner.nextInt();
        int[] vector = new int[vectorSize];

        //setarea valorilor pentru vector
        for (int i = 0; i < vectorSize; i++) {
            System.out.println("Introduceti valoare pentru pozitia " + i);
            int number = scanner.nextInt();
            vector[i] = number;
        }

        //afisarea vectorylui dat de tastatura
        for (int number : vector) {
            System.out.print(number + " ");
        }

        //calculul mediei aritmetice
        int sum = 0;
        for (int i = 0; i < vectorSize; i++) {
            sum = sum + vector[i];
        }

        //afisarea mediei aritmetice
        System.out.println();
        System.out.println("Media aritmetica este: " + (double) sum / vectorSize);
    }

}
