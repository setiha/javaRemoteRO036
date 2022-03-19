package ro.sda.curs4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persoana {

    private String nume;
    private String prenume;

    public void setNume(String nume) throws Exception {
        this.nume = nume;
        Pattern patternNume = Pattern.compile("[A-Za-z]{2,}");
        Matcher matcherNume = patternNume.matcher(nume);
        if (!matcherNume.matches()) {
            throw new Exception("Numele trebuie sa contine cel putin doua litere");
        }
    }

    public void setPrenume(String prenume) throws Exception {
        this.prenume = prenume;
        Pattern patternPrenume = Pattern.compile("[A-Za-z]{2,}");
        Matcher matcherPrenume = patternPrenume.matcher(prenume);

        if (!matcherPrenume.matches()) {
            throw new Exception("Prenumele trebuie sa contine cel putin doua litere");
        }

    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    //proprietati: prenume, nume -private
    // setter, getter - getFullName

    //setPreune() - verificare ca inputul sa fie de lungime mai mare de 1
    //setNume() - verificare ca inputul sa fie de lungime mai mare de 1


    public String getFullName() {
        return nume + " " + prenume;
    }

    public static void main(String[] args) {

    }
}
