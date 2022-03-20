package ro.sda.curs9FivePrinciples.abstraction;

public interface FisaPostului {
    //in interfata nu avem proprietati cu exceptia celor care sunt statice si final adica constante
    //in interfete nu avem constructor
    //toate metodele din interfece sunt prin definitie abstracte - nu are implementare, nu are un block de cod
    //toate metodele din interfata sunt publice
    //nu putem instantia direct o interfata
    //pentru instantiere folosim intefete anonime sau clase care implementeaza acele interfete
    //o clasa se poate extinde cu extends o interfata se poate adauga intro clasa cu ajutorul lui "implements"
    //o clasa poate sa implementeze o infinitate de interfete( citeste despre solid Principles)
    //putem avea metode cu block in interfete
    //keywordul "default" ne permite sa avem metode cu block in interfete
    //metodele care sunt default nu trebuie sa le implementam dar putem sa suprascriem
    // a nu se confunda cu modificatorul de acces "default"

    void pontareCheckIn();

    void pontareCheckOut();

    void getZiLibera(String date);

    default void prinMessage(String message) {
        System.out.println("Interfate" + message);
    }
}

//interfete functionala
// o interfata functionala este o interfata care contine o singura metoda abstracta
//-ea poate sa contina o infinitate de metode default -