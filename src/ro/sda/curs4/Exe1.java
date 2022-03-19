package ro.sda.curs4;


public class Exe1 {
    static double calcul(int a, int b, int c) {
        double numberEx = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        if(numberEx < 0){
            absEx(numberEx);
        }
        return numberEx;
    }

    static double absEx(double e) {
        if (e > 0) {
            return e;
        } else {
            return e * (-1);
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
