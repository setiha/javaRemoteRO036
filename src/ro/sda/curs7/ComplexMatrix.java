package ro.sda.curs7;

import java.util.Scanner;

public class ComplexMatrix {
    public static void main(String[] args) {

        System.out.println("Input Size Mtarix");
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        int[][] matrice = new int[matrixSize][matrixSize];

        setMatrixValue(matrice, matrixSize);
        printMatrix(matrice, matrixSize);
    }

    public static void setMatrixValue(int[][] matrice, int matrixSize) {
        //initializare matrice patratica cu dimensiunea data de la tastatura matrixSize
        //Setare valori matrice pe diagonala principala
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrice[i][j] = (i + 1) * (j + 1);
            }
        }
    }
//
    public static void printMatrix(int[][] matrice2, int matrixSize) {
        //afisare
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.printf("%3d  ", matrice2[i][j]);
            }
            System.out.println();
        }
    }
}
