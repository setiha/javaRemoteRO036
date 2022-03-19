package ro.sda.curs4;

public class textExe {
    public static void main(String[] args) {
        String textSalut = "Salut";
        String numeUser = "Alex";
        String numeUser2 = "Andrei";

        String text2 = numeUser2;
        System.out.println(textSalut + numeUser);
        System.out.println(textSalut + numeUser2);
        System.out.println(numeUser.equals(numeUser2));
        System.out.printf("%.3f", 100.0 / 3.0);
    }
}
