package ro.sda.curs4;

public class Main {
    public static void main(String[] args) {
        //constructor cu doua argumente am initializat o in constructor viteza si culoarea
        //initializes proprietatiile  di car folosind consrtuctorul
        Masina masina1 = new Masina(100, "verde");
        Masina masina2 = new Masina(200, "rosu");
        //proprietatea viteza si culoarea verde apartin obiectului masina1
        //constructorul este o metoda de creare a obiectului
        // new Car() -constructor default este constructorul fara argumente
        //car1 = obiectul
        //Car tipul de data
        masina1.afisare();
        System.out.println(masina1.NR_ROTI);
        System.out.println(Masina.NR_ROTI);
        //Nr roti variabila comuna tuturo masinilor -nu am nevoie de o instanta pt a accesa acesta prop
        //static pot accesa variabila folosind denumirea clasei
        Masina.metoda();
        masina1.metoda();
        MasinaSetter masinaDefault = new MasinaSetter();
        masinaDefault.afisare();

        MasinaSetter masinaSetat = new MasinaSetter("galben");
        masinaSetat.afisare();

        MasinaSetter masinaCuSetter = new MasinaSetter();
        masinaCuSetter.setCuloare("rosu");
        masinaCuSetter.afisare();

    }
}
