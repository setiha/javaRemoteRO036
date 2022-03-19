package ro.sda.curs3;

public class ArrayEx {
    public static void main(String[] args) {
        String[] numePersoane = new String[4];
        numePersoane[2] = "Alex";
        for (int i = 0; i <= 3; i++) {
            System.out.println("Pozitia[" + i + "[ se afla elementul: " + numePersoane[i]);
        }

        //cum se intitializeaza mai repede si nu trebuie sa spun cit spatiu sami aloce
        String[] numePers = new String[]{"Alex", "Marian"};
        for (int i = 0; i < numePers.length; i++) {
            System.out.println(i + " ->" + numePers[i]);
        }

        int[] numereEx = new int[]{1, 27, 58, 3, 4};
        int sum = 0;
        for (int i = 0; i < numereEx.length; i++) {
            sum += numereEx[i];
            System.out.println(sum);
        }

        int rezultatInmultire = 1;
        int i = 0;
        while (i < numereEx.length){
            rezultatInmultire *= numereEx[i];
            i++;
        }
        System.out.println(rezultatInmultire);

    }
}
