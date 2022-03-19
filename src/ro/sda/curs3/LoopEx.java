package ro.sda.curs3;

import java.util.Scanner;

public class LoopEx {
    public static void main(String[] args) {
        //Adun primere 100 de numere si afisez rezultatul (1-100);
        int suma = 0;
        //suma primelor n numere n de la tastatura
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti limita superioara");
        int limitaSuperioara = scanner.nextInt();
        for (int i = 0; i <= limitaSuperioara; i++) {
            suma += i;
        }
        System.out.println(suma);


        //cand suma devina egala cu nr dorit ne oprim din a mai aduna numere
        int nrDorit = 15;
        int sum = 0;
        int i = 1;
        while (sum != nrDorit) {
            sum = sum + i;
            i++;
            System.out.println("Mc: suma = " +suma + ", i = " +i);
        }
        System.out.println("Pentru a obtine " + nrDorit + "avem nevoie de suma de la 1 pana la " + (i-1));
    }



}

