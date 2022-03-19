package ro.sda.exercitii;

import java.util.Scanner;

public class ArrayExercise {
    private int[][] newArray;

    public ArrayExercise() {
    }

    public static void main(String[] args) {
        ArrayExercise newEx = new ArrayExercise();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea matricei");
        int fromUser = scanner.nextInt();
        //newEx.setNewArray(fromUser);
        newEx.setTableOfNewArray(fromUser);
    }


    public int[][] getNewArray() {
        return newArray;
    }

    //Scrieti un program care citeste de la tastatura dimensiunea unui vector n. Creati un vector cu acea dimensiune. Introduceti de la tastatura //elementele vectorului. Afisati vectorul, apoi afisati doar elementele pare.

    /*public void setNewArray(int fromUser) {
        newArray = new int[fromUser][fromUser];
        for (int i = 0; i < fromUser; i++) {
            for (int j = 0; j < fromUser; j++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduceti numarul nr: " + i + " " + j);
                int elementFromUser = scanner.nextInt();
                this.newArray[i][j] = elementFromUser;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println();
            for (int j = 0; j < newArray.length; j++) {
                System.out.print(" " + newArray[i][j]);
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println();
            for (int j = 0; j < newArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(" " + newArray[i][j]);
                }

            }
        }
    }*/


     /*8. Scriti un program care citeste de la tastatura un nr si afiseaza un tablou de forma:
            1	2	3	4	5
            2	4	6	8	10
            3	6	9	12	15
            4	8	12	16	20
            5	10	15	20	25*/

    public void setTableOfNewArray(int fromUser) {
        newArray = new int[fromUser][fromUser];
        for (int i = 0; i < fromUser; i++) {
            for (int j = 0; j < fromUser; j++) {
                newArray[i][j] = (i+1)*(j+1);
            }
        }
        for (int i = 0; i < fromUser; i++) {
            System.out.println();
            for (int j = 0; j < fromUser; j++) {
                System.out.print(newArray[i][j] + "   ");
            }
        }
    }
}
