package ro.sda.curs9FivePrinciples.inheritance;

public class Main {

    public static void main(String[] args) {
        //aici ne referim la obiecte de programare
        //ia principiul de baza, dar primeste in plus citeva abilitati
        //stim mai multe decat stiu parintii
        // o parinte functionalitate de baza si copilul are functionalitate de baza si ceva in plus
        //un obiect poate sa aiba un singur parinte
        //o parinte poate sa aiba o infinitate de copii
        //pentru a realiza o relatie de mostenire avem extend se scrie inainte de acolade
        //mostenirea se realizeaza cu ajutorul cuvantului "extends"
        //cand mostenim o clasa, preluam in copil toate proprietatiile, metodele si toti constructorii din clasa parinte
        //subclasa este clasa copil
        Car dacia = new Car(true,"1300", "Dacia", 4, "Albastru", 160);
       //-un obiect de tipul vehicul, si obiectul de tipul car
        System.out.println("Max speed: " + dacia.getMaxSpeed());
    }


}
