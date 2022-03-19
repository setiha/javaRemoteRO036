package ro.sda.curs5;

public class Exemple {
    public static void main(String[] args) {
        int x = Short.MAX_VALUE + 1;
        System.out.println(x);
        //short y = (short) x;

        //int y = (int) x;
        long y = (long) x;
        System.out.println(y);
    }
}
