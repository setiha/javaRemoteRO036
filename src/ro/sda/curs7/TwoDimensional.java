package ro.sda.curs7;

import java.util.Scanner;

public class TwoDimensional {
    public static void main(String[] args) {
        System.out.println("Input Size Mtarix");
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        int[][] matrice = new int[matrixSize][matrixSize];

        //setMatrixValue(matrice, matrixSize);
        setMatrixValueReversed(matrice, matrixSize);
        printMatrix(matrice, matrixSize);
        //setMatrixValueReversedFromLeft(matrice, matrixSize);
        //printMatrix(matrice, matrixSize);
    }

    public static void setMatrixValueReversed(int[][] matrice, int matrixSize) {
        //initializare matrice patratica cu dimensiunea data de la tastatura matrixSize
        //Setare valori matrice pe diagonala principala
        for (int i = 0; i < matrixSize; i++) {
            for (int j = matrixSize - 1; j >= 0; j--) {
                if (j == matrixSize - i - 1) {
                    matrice[i][j] = j;
                }
            }
        }
    }



    public static void setMatrixValueReversedFromLeft(int[][] matrice, int matrixSize) {
        //initializare matrice patratica cu dimensiunea data de la tastatura matrixSize
        //Setare valori matrice pe diagonala principala
        for (int i = matrixSize - 1; i >= 0; i--) {
            for (int j = matrixSize - 1; j >= 0; j--) {
                if (i == j) {
                    matrice[i][matrixSize - 1 - i] = j;
                }
            }
        }

    }

    public static void setMatrixValue(int[][] matrix, int matrixSize) {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j) {
                    matrix[i][j] = j;
                    System.out.print(j);
                }
            }
        }
    }

    public static void printMatrix(int[][] matrice2, int matrixSize) {
        //afisare
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrice2[i][j]);
            }
            System.out.println();
        }
    }


}
