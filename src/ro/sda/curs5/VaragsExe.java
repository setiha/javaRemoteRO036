package ro.sda.curs5;

public class VaragsExe {

    static int adunare(int... numere) {
        // int[] numere
        int suma = 0;
        for (int i = 0; i < numere.length; i++) {
            suma += numere[i];
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println(adunare(1, 2, 3));
        System.out.println(concat(" ", "unu", "doi", "trei"));
        System.out.println(concat(",", "unu", "doi", "tre", "patru"));
    }

    public static String concat(String delimitator, String... cuvinte) {
        String result = cuvinte[0];
        for (int i = 1; i < cuvinte.length; i++) {
            result  += delimitator + cuvinte[i];
        }
        return result;
    }
    // problema
    //Trimit varargs Etring -> returnez un alt string -> concatenarea imputului cu spatii intre
    //concat(" " cat", "dog")
    //concat(", " cat", "dog")


}
