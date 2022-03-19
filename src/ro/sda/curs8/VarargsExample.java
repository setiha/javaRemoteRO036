package ro.sda.curs8;

public class VarargsExample {
    public static void main(String[] args) {

        //varargs -> var args -> variable arguments
       // displayColleagues("Ionut");
        displayColleagues("Ionut","Andrei");
    }

    public static void displayColleagues(String person, String... colleagues) {
        if (colleagues.length > 0) {
            System.out.println("Colleagues for person " + person + " are");
        }
        for (String colleague : colleagues) {
            System.out.println(colleague + " ");
        }
    }
}
