package ro.sda.curs9.inheritance;

public class Car extends Vehicle {
    boolean isManual;
    private String model;
    private String brand;

    public Car(boolean isManunal, String model, String brand, int wheelsNumber, String color, double maxSpeed) {
        //super este echivalentul lui this cu mentiunea ca se foloseste doar in relatii de mostanire
        //super face referire la proprietati metode, constructori din clasa parinte
        //trimitem parametrii catre constructorul din clasa parinte vehicle
        //in acest caz super trebuies sa fie prima linie din constructor
        //super creaza o instanta de tipul vehicle, adica este echivalentul lui new vehicle
        super(wheelsNumber, color,maxSpeed);

        this.brand = brand;
        this.model = model;
        this.isManual = isManunal;
    }

}
