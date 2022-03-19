package ro.sda.curs2;

public class VarGlobalLocal {
     static int varGlobal = 22;
    public static void main(String[] args) {
        int a = 5;
        if (1 > 0) {
            //Variabila b exista pentru blocul if
            int b = a;
            int varDinIf = varGlobal;
            System.out.println("Unu mai mare ca zero");
        } else {
            int c = a + 1;
            System.out.println("Unu nu e mai mare ca zero");
        }
    }
}
