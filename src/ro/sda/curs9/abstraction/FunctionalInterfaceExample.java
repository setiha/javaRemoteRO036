package ro.sda.curs9.abstraction;

public interface FunctionalInterfaceExample {
    //se folosesc interfetele cand clasa noastra are o parinte si avem nevoie de functionalitati
    //vrem ca metodele sa fie folosite in mai multe clasa
    //trebuie sa aiba cel mult o metoda abstracta
    int calculateAB(int a, int b);

    default int sumAB(int a, int b) {
        return a + b;
    }
}
