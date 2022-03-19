package ro.sda.curs4;

public class MasinaSetter {
    private String culoare = "alb";

    public int getSuma() {
        return suma;
    }

    private int suma = 100;

    public MasinaSetter(String culoare) {
        //constructor cu un singur parametru
        this.culoare = culoare;
    }

    public MasinaSetter() {
        //constructor cu un singur parametru
        //daca ai facut un alt constructor trebuie sa faci pe cel default
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void afisare() {
        System.out.println("Masina [ culoare = " + culoare + " ]");
    }

    //getter - fieldul meu (proprietatea) e privat creez a metoda
    // de ex culoare e privata -folosim getColor getter
}

