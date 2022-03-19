package ro.sda.curs3;

import java.util.Arrays;

public class MetodeEx {
    static void hello(String name) {
        System.out.println("Hello " + name);
    }

    static int addition(int a, int b) {
        return a + b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static void returnExample(int number) {
        if (number % 2 == 0) {
            return;
        }
        System.out.println(number);
    }    //void tip return void nu returneaza, m1 - denumire, argumente


    int[] resultAdditionMethod = new int[3];

    static void methodAddition(int[] v, int[] v1) {
        for (int i = 0; i < v.length; i++) {

            System.out.println(v[i] + v1[i]);
        }
    }


    static void printArray(int[] v) {
        System.out.print("[" + v[0]);
        for (int i = 1; i < v.length; i++) {
            System.out.print("," + v[i]);
        }
        System.out.println("]");
    }


    static int methodMedia(int[] arg) {
        int resultMedia = 0;
        for (int j : arg) {
            resultMedia += j;
        }
        return resultMedia / arg.length;
    }

    static void methodSort(int[] arg) {
        for (int i = 0; i < arg.length; i++) {
           for(int j = 0; j<arg.length; j++){
               int tmp = 0;
               if(arg[i] < arg[j]){
                   tmp = arg[i];
                   arg[i] = arg[j];
                   arg[j] = tmp;
               }
           }
        }
    }
//sa calculeze media elementelor unui array;


    public static void main(String[] args) {
        int[] forChange = new int[3];
        int[] media = {10000, 2, 231};
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] v1 = new int[]{321, 1, 2, 3, 4};
        System.out.println(methodMedia(media));
        methodSort(media);
        printArray(media);
        //printArray(v1);
        //methodAddition(array1, array2);
        //hello("Marian");
        //hello("Alex");
        //System.out.println(multiplication(5, 10));
    }


}
