package ro.sda.curs2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringClass {
    public static void main(String[] args) {
        int a = 5;
        String text = "Variabila a = " + 5;
        String text2 = String.format("Variabila a = %d", a);

        System.out.println(text);
        System.out.println(text2);

        Scanner scanner = new Scanner(System.in);
//        String inpuFromUser = scanner.nextLine();
//
//        System.out.println("Utilizatorul a introdus");
//        System.out.println("Introduceti temperatura");
//        String  temp = scanner.nextLine();
//        System.out.println("Temp form user: " + temp);

//        System.out.println("Introdu Nume");
        String numeUtilizator = scanner.nextLine();
//        System.out.println("Utilizatorul a introdus: " + numeUtilizator);

        Pattern patternNume = Pattern.compile("[A-Z][a-z]+");
        Matcher matcherNume = patternNume.matcher(numeUtilizator);

        //daca gaseste strict acest patern
        if (matcherNume.matches()) {
            System.out.println("Utilizatorul a introdus numele corect");
        } else {
            System.out.println("Utilizatorul nu a introdus corect");
        }

        //daca gaseste paternul acolo e valid
        if(matcherNume.find()){
            System.out.println("Utilizatorul a introdus numele corect");
        }else{
            System.out.println("Utilizatorul nu a introdus corect");
        }

        String val1 = "I am so tired";
        String val2 = val1.intern();
        System.out.println(val2);
        String val3 = "Astazi am fost la gimnastica";
        String val4 ="De fapt era kettlebell. Gimnastica cu greutati, cu bile";
        System.out.println(val3.concat(val4));
        System.out.println(val4.indexOf("kettle"));
        System.out.println(val4.replace("fapt", "formidabil"));
        System.out.println(val4.replaceAll(val4, "nu vreu sa spun nimic"));
        System.out.println(val4);
    }
}
