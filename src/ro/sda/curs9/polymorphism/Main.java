package ro.sda.curs9.polymorphism;

public class Main {
    public static void main(String[] args) {
        // ceva care are mai multe forme
        //1.overrinding-suprascriem o metoda din clasa parinte in clasa copil


        Parent parent = new Parent("Ion");
        parent.showName();

        Child child = new Child("Mihai");
        child.showName();

        //2.overload
        //se tine cont doar de semnatura metodei
        //overload reprezinta supraincarcarea unui constructor sau unei metode

        //3.polimorphism
        Parent p = new Child("Catalin");
        //in p nu vom vedea proprietatiile si metodele definite in child numai cele definite in parinte
        Child c = new Child("Raul");
        //Nu se poate pentru ca partea stanga stie mai multe decat in dreapta
        //Child d = new Parent("Raul");

        //sa identificam ce tip de data avem
        //instance of

    }

    //overload reprezinta supraincarcarea unui constructor sau unei metode
    public void printMessage() {
    }

    //nu se considera overload pentru ca nu e supraincarcarea metodei, semnatura nu este diferita
    // public int printMessage(){}
    public void printMessage(String message) {
    }

    public void printMessage(String message, int type) {
    }

    public void printMessage(int type, String message) {
    }

}
