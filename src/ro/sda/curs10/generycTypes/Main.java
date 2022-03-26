package ro.sda.curs10.generycTypes;

public class Main {
    public static void main(String[] args) {
        //clase generice - nu au nici o legatura cu continutul
        GenericBox<String> stringBox = new GenericBox<>("JavaRemote Ro36");
        System.out.println(stringBox.getItem());

        GenericBox<Integer> integerBox = new GenericBox<>(36);
        System.out.println(integerBox.getItem());

        Samsung s22 = new Samsung("Samsung", "s22", "gray");

        GenericBox<Samsung> samsungBox = new GenericBox<>(s22);
        samsungBox.getItem().printPhoneDetails();

        GenericBoxLimited<Samsung> samsungGenericBoxLimited = new GenericBoxLimited<Samsung>(s22);
        samsungGenericBoxLimited.getItem().printPhoneDetails();
        samsungGenericBoxLimited.print();

        GenericBoxLimited<Phone> phoneGenericBoxLimited = new GenericBoxLimited<>(null);

    }


}
