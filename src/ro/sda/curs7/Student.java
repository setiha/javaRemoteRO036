package ro.sda.curs7;



public class Student {
    /*2.Definiti clasa Student ce contine: nume, prenume, varsta, anulAbsolvirii, medie. Scrieti un program care citeste de la tastatura un numar
    n - numarul studentilor, creati un vector de studenti si setati pentru fiecare student campurile respectice.
            a) Afisati toti studentii.
            b) Scrieti o functie care cauta un student dupa nume si il afiseaza;
    c) afisati studentul cu media cea mai mare;
    d) verificati daca anul absolvirii pentru un student anume este an bisect.
            BONUS: e) sortati vectorul in functie de medie si afisati pe ecran*/

    public String nume;
    public String prenume;
    public int varsta;
    public int anulAbsolvirii;
    public double medieAbsolvire;

    public Student() {
    }

    public Student(String nume, String prenume, int varsta, int anulAbsolvirii, double medieAbsolvire) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.anulAbsolvirii = anulAbsolvirii;
        this.medieAbsolvire = medieAbsolvire;
    }

    public boolean afisareStudent() {
        System.out.println("Student: ");
        System.out.println("nume: " + this.nume);
        System.out.println("prenume: " + this.prenume);
        System.out.println("varsta: " + this.varsta);
        System.out.println("anul absolvirii: " + this.anulAbsolvirii);
        System.out.println("medie absolvire: " + this.medieAbsolvire);

        return true;

    }
}
