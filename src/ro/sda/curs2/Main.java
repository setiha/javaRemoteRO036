package ro.sda.curs2;

public class Main {
    public static void main(String[] args) {
        String numeUtilizator = "Marian";

        //Testam daca utilizatorul a introdus un nume
        //IsEmpty -> returneaza true daca stringul este gol
        //isNotEmpty - nu este gol -> !isEmpty ->

        if(numeUtilizator.isEmpty() == false){
            System.out.println("Utilizatorul a introdus numele " + numeUtilizator);
        }
        if(numeUtilizator.length() > 0) {
            System.out.println("Utilizatorul a introdus numele " + numeUtilizator);
        }
    }
    //Moduri in care testez daca numele utilizatorului nu este gol
    //Testez ca numeUtilizator.IsEmpty() == false
    //Testez !numeUtilizator.isEmpty() == true
    //testez lungimea sirului de caractere sa fie diferit
}
