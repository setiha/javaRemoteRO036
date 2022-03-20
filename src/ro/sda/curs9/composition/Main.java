package ro.sda.curs9FivePrinciples.composition;

public class Main {
    public static void main(String[] args) {
        // posibilitatea un obiect sa aiba in interiorul lui alte obiecte -relatie de compozitie la Vehicle class
        //compozitia este principiul care ne permita sa avem proprietatti pentru un obiect de tipul altor obiecte
        //telefon si fiecare component sa fie o clasa
        Bed bed = new Bed(2000, 1800);
        TvSamsung tvSamsung = new TvSamsung(165, "black", true);

        Bedroom bedroom = new Bedroom();
        bedroom.setBed(bed);
        bedroom.setTvSamsung(tvSamsung);

        System.out.println(bedroom);
    }


}
