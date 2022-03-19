package ro.sda.curs7;

public class TernaryOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        boolean comparation = false;

        if (a > b) {
            comparation = false;
        } else {
            comparation = true;
        }

        //ternary operator e un if simplificat

         boolean comparation1 = a == b ? true : false;
    }
}
