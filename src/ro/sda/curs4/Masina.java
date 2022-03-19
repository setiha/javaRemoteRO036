package ro.sda.curs4;

public class Masina {
    //conventie java contantele sunt cu litere mari
    public final static int NR_ROTI = 4;
    public int viteza;
    private String culoare;

    public void afisare() {
        System.out.println("Masina [ viteza = " + viteza + ", culoare = " + culoare + "]");
    }

    public static void metoda() {
        System.out.println("Afisare din clasa masina ");
    }

    public Masina(int viteza, String culoare) {
        this.viteza = viteza;
        this.culoare = culoare;
    }

    public void schimbaViteza(int vitezaNoua) {
    }

    //modificari de acces public/private/protected
    //public poate fi vzut din afara clasei
    //private nu putem accesa din afara clasei
    //proprietate

    //setter, getter setter -setam proprietatiile unui obiect
    // constructor, predefinit, metoda set
}
