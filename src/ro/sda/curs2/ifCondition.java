package ro.sda.curs2;

public class ifCondition {

    public static void main(String[] args) {

        if (true) {
            //true == true
        }
        if (1 > 0) {
            // (1>0) == true true == true iti evaluaza
        }
        if (1 > 0) {

        } else {
            //ramura else
            //in caz ca 1>0 nu e adevarat
        }

//Afisam vremea de afara pe baza temperaturii
        //temp == 10 -> frig
        //temp ==20 -> cald
        //temp == 30 -> foarte cald

        int temp = 10;
        if (temp == 10) {
            System.out.println("Afara e frig");
        } else if (temp == 20) {
            System.out.println("Afara e cald");
        } else if (temp == 30) {
            System.out.println("Afara e foarte cald");
        }else{
            System.out.println("Error");
        }

    }
}
