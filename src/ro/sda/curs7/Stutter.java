package ro.sda.curs7;

import java.util.Scanner;

public class Stutter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* String scannedText = scanner.nextLine();
        System.out.println(scannedText);
        String[] splitResult = scannedText.split(" ");
        for (int i = 0; i < splitResult.length; i++) {
            System.out.print(splitResult[i] + " ");
            System.out.print(splitResult[i] + " ");
        }*/

        /*for(int i = 0; i< splitResult.length; i++){
            System.out.println();
            for(int j = 0; j <=1; j++){
                System.out.print(" " + splitResult[i]);
            }
        }*/

       /* System.out.print("Insert text: ");
        String text = scanner.nextLine();

        System.out.println(text);

        String[] stringsSplitBySpace = text.split(" ");
        for (String word : stringsSplitBySpace) {
            System.out.print(word + " ");
            System.out.print(word + " ");
        }

        System.out.println();
        for (int i = 0; i < stringsSplitBySpace.length; i++) {
            if (i == stringsSplitBySpace.length - 1 && stringsSplitBySpace[i].charAt(stringsSplitBySpace[i].length() - 1) == '.') {
                System.out.print(stringsSplitBySpace[i].substring(0, stringsSplitBySpace[i].length() - 1) + " " + stringsSplitBySpace[i]);
            } else {
                System.out.print(stringsSplitBySpace[i] + " " + stringsSplitBySpace[i] + " ");
            }
        }*/
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') {
                text = text.replace('.', ' ');
            }
        }

        System.out.println(text);
    }
}
