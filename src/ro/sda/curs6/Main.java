package ro.sda.curs6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce o valoare");
        int a = input.nextInt();
        System.out.println("Introduce o alta valoare");
        int b = input.nextInt();

        int rezultat = 0;
        System.out.println("Introduce un operator");
        String operator = input.next();

        computer(operator, a, b);
        rezultat = computer(operator, a, b);
        System.out.println(rezultat);

    }

    public static int computer(String operator, int a, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Operatie gresita");

                }
            default:
                System.out.println("Invalid omperator");

        }
        return -1;
    }

}
