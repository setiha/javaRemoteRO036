package ro.sda.curs2;

public class SwitchCase {
    public static void main(String[] args) {
        int temp = 11;
        switch (temp) {
            case 10:
                System.out.println("Frig");
                break;
            case 20:
                System.out.println("Cald");
                break;
            default:
                System.out.println("Necunoscuta");
                break;
        }
        System.out.println("Sfarsit program");
    }
}
