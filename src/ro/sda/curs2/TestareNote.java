package ro.sda.curs2;

public class TestareNote {

    public static void main(String[] args) {
        //afiseaza daca studentul a trecut la materia x daca nota student mai mare ca cinci
        //daca nu afisam ca a picat;
        //ceva diferit de altceva !=;
        int notaStudent = 5;
        notaStudent = 4;

        if (notaStudent >= 5) {
            System.out.println("Studentul a trecut");
        } else {
            System.out.println("Studentul a picat");
        }
    }
}
