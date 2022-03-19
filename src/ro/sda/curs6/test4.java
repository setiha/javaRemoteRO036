package ro.sda.curs6;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        int maxLength = 0;
        String longestText = "";

        while (!"enough".equals(text)) {
            text = scanner.nextLine();
            int l = text.length();

            if (maxLength < l) {
                maxLength = l;
                longestText = text;
            }
        }
        System.out.println(longestText);
    }
}
