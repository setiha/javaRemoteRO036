package ro.sda.curs6;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fromUser = scanner.nextLine();
        int counter = 0;
        int totalLength = fromUser.length();
        for (int i = 0; i < totalLength; i++) {
            if (fromUser.charAt(i) == ' ') {
                counter = counter + 1;
            }
        }
        System.out.println("totalLength: " + totalLength);
        System.out.println("Counter :" + counter);
        System.out.println((double) counter * 100 / totalLength);
        System.out.println(fromUser.indexOf("r"));
    }
}
