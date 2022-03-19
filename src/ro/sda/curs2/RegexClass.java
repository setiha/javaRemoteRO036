package ro.sda.curs2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameUser = scan.nextLine();


        Pattern patternNume = Pattern.compile("[A-Za-z]{2,}");
        Matcher matcherNume = patternNume.matcher(nameUser);

        if (matcherNume.matches()) {
            System.out.println("Corect");
        } else {
            System.out.println("Incearca inca odata");
        }
        //daca gaseste strict acest patern
        /*if (matcherNume.matches()) {
            System.out.println("Utilizatorul a introdus numele corect");
        } else {
            System.out.println("Utilizatorul nu a introdus corect");
        }*/
    }
}
