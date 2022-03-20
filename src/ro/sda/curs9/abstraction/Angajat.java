package ro.sda.curs9FivePrinciples.abstraction;

public abstract class Angajat implements FisaPostului {
    //modul de functionare al metodei este ascunse
    //clasele abstracte se folosesc pentru a fi parinti pentru alte clase
    // o metode abstracta - in momentu in care extindem clasa copii sunt obligati sa suprascrie
    // o clasa abstracta se recunoaste dupa keywordul "abstract"  semnatura
    // este folosita ca fiifnd o clasa parinte - in cele mai multe cazuri
    // clasa abstracta nu se poate instantia in odul clasic, adica nu putem folosi new Angajat()
    //se instanteaza cu ajutorul copiilor sau claselor "Anonime"
    // doar in clasele abstracte putem avea metode abstracte, adica metode fara block de cod


    private String name;
    private int age;
    private double tarifOra;

    public Angajat(String name, int age, double tarifOra) {
        this.name = name;
        this.age = age;
        this.tarifOra = tarifOra;

    }

    public double calculateSalary(int nrOre) {
        return this.tarifOra * nrOre;
    }

    //Metoda abstracta are keywordul abstract in semnatura si ";" la final
    //metodele abstracte se pot defini doar in clasele abstracte
    //compilatorul nu ne da voie sa cream o metoda care nu au un block de cod, nu au implementare
    public abstract double CalculateSalaryBonus();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getTarifOra() {
        return tarifOra;
    }
}
