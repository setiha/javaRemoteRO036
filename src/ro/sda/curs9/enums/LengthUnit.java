package ro.sda.curs9.enums;

public enum LengthUnit {
    //putem sa definim elementele fara sa specificam tipul de data
    //sa fie definite cu litere mari si separate prin virgula

    //instantierea enumurilor
    CM(0.01),
    METER(1),
    FOOT(0.32),
    KM(1000);

    double value;

    //constructor
    LengthUnit(double value) {
        this.value = value;
    }

    //TODO conversia intre untitatiile de masura
    double convertToMeter() {
        return this.value;
    }

}
