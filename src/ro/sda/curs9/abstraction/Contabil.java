package ro.sda.curs9FivePrinciples.abstraction;
//in copii claselor abstracte trebuie sa suprascriem doar metodele abstracte
//daca metodele care nu sunt abstracte nu sunt suprascrise se foloseste implementarea din parinte
public class Contabil extends Angajat implements  FisePostExertContabil {
    public Contabil(String name, int age, double tarifOra) {
        super(name, age, tarifOra);
    }

    @Override
    public double CalculateSalaryBonus() {
        return 0;
    }

    @Override
    public void pontareCheckIn() {

    }

    @Override
    public void pontareCheckOut() {

    }

    @Override
    public void getZiLibera(String date) {

    }

    @Override
    public void printCheckBilant() {

    }

    @Override
    public void printFacturi() {

    }
}
