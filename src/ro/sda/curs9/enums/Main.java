package ro.sda.curs9.enums;

import ro.sda.curs9.inheritance.Vehicle;

public class Main {
    public static void main(String[] args) {
        //le apelam ca si ar fi statice
        //afiseaza numele enumurilor cum le am definit eu
        System.out.println(LengthUnit.CM);
        System.out.println(LengthUnit.FOOT);
        System.out.println(LengthUnit.KM);
        System.out.println(LengthUnit.METER);
        LengthUnit unit = LengthUnit.CM;
        switch (unit) {
            case CM:
                System.out.println("Centimetru");
                System.out.println(LengthUnit.CM);
                break;
            case FOOT:
                System.out.println("Picioare");
                System.out.println(LengthUnit.METER);
                break;
            case METER:
                System.out.println("Meter");
                break;
            case KM:
                System.out.println("KM");
                break;
            default:
                System.out.println("Cazul default");
        }
        System.out.println("-----------");
        System.out.println(LengthUnit.valueOf("CM").value);
        System.out.println("--------");
        for (LengthUnit lengthUnit : LengthUnit.values()) {
            System.out.println(lengthUnit.value + "convert to meter: " + lengthUnit.convertToMeter());
            System.out.println("-------");
        }
    }
}
