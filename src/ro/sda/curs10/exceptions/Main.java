package ro.sda.curs10.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex2();
        /**
         * Sunt 2 tipuri de exceptii
         * 1. Exceptii de platforma sau environment - Throwable -> OutOfMemoryException
         * 2. Exceptii de programare - Exception -> NullPointerException, ArithmeticalException, OutOfBoundsException
         *
         *
         * Blocul try - catch -> ne ajuta sa prindem si sa gestionam exceptiile de orice fel
         * Blocul try - catch - finally -> ne ajuta sa prindem si  sa gestionam orice fel de exceptie,
         *                                 iar ramura finally se executa indiferente daca avem sau nu o exceptie
         *
         *                                 finally - este o ramura OPTIONALA
         * Pe ramura lui catch puteam avea o infinitate de exceptii
         */

        String name = null;
        try {
            int result = 5 / 0;

            System.out.println(result);


            // name este NULL si vom avea exceptie
            String nameTrim = name.trim();

            // cand apare o exceptie, codul de dupa locul exceptiei nu se mai exectuta,
            // sare in catch si apoi merge mai departe
//            System.out.println("test: " + nameTrim);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Impartirea la 0 nu are sens");
            System.out.println(arithmeticException.getMessage());
        } catch (NullPointerException | IndexOutOfBoundsException ex) {
            // daca este NullPointerException sau IndexOutOfBoundsException se executa codul de mai jos

            // se foloseste "|" atunci cand pentru 2 exceptii diferite vrem sa avem acelasi cod. (DOAR IN CAZUL CATCH

//        } catch (NullPointerException nullPointerException) {
//            System.out.println("Eroare");
//        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
//            System.out.println("Eroare");
        }

        catch (Exception e) {
            System.out.println(e.getMessage());

        } catch (Throwable t) {
            System.out.println("Trowable exception");
        } finally {
            System.out.println("Finally case  for trey catch");
            if(name == null) {
                name = "Ana";
            }
        }

//        EmailException emailException = new EmailException("mesaj");
//        throw emailException;
//        sau
//        throw new EmailException("nesaj");

        // throw => ne ajuta sa aruncam o exceptie throw new Exception()
        // throws => se foloseste in semnatura metodei si ne specifica tipul
        // de exceptie pe care metoda o poate arunca, si faptul ca metoda arunca
        // una sau mai multe exceptii.


        System.out.println("-------------------------");
        setupEmailWithThrow();

        System.out.println("---------------------------");
        try {
//            setupEmailWithThrows();
            testThrows();
        } catch (EmailException emailException) {
            // afisam mesajul de eroare
            System.out.println(emailException.getMessage());
        } catch (Throwable t) {
            System.out.println("General exception: " + t.getMessage());
        }

        // autoClosing -> face referire la obiectele care au ca interfata AutoCloseable
        //                obiectele care au aceasta interfata sunt Scanner, BufferReader, BufferWriter, etc
        //                obiecte care ne ajuta la citerea, scriererea datelor
        try (Scanner scanner = new Scanner(System.in)) {
            String namePerson = scanner.nextLine();
            System.out.println(namePerson);
            // metoda close() se apeleaza automat la finalul bloclui de cod
//            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void testThrows() throws EmailException {
        setupEmailWithThrows();
    }

    public static void setupEmailWithThrow() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceti o adresa de email");
        String email = scanner.nextLine();

        try {
            // daca email nu contine @
            if(!email.contains("@")) {
                // aruncam o exceptie
                throw new EmailException("Lipseste semnul @");
            }

            if(!email.contains(".")) {
                throw new EmailException("Lipseste cel putin un carecatre .");
            }

            System.out.println("Emailul este valid!");

        } catch (EmailException emailException) {
            System.out.println(emailException.getMessage());
        } catch (Throwable t) {
            System.out.println("General exception: " + t.getMessage());
        }


    }

    public static void setupEmailWithThrows() throws EmailException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceti o adresa de email");
        String email = scanner.nextLine();

        // daca email nu contine @
        if(!email.contains("@")) {
            // aruncam o exceptie
            throw new EmailException("Lipseste semnul @");
        }

        if(!email.contains(".")) {
            throw new EmailException("Lipseste cel putin un carecatre .");
        }

        System.out.println("Emailul este valid!");



    }

    /**
     * Write an application that will read the input and print back value that user provided, use try-catch statements to parse the input, e.g. I/O:
     * Input: 10
     * Output: int -> 10
     * Input: 10.0
     * Output: double -> 10.0
     * Input: „Hello!”
     * Output: „Hey! That’s not a value! Try once more.”
     */
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String value = scanner.nextLine();

            if(value.contains(",")) {
                value = value.replaceAll(",", "");
            }
            try {
                if(!value.contains(".")) {
                    int val = Integer.parseInt(value);
                    System.out.println("int -> " + val);
                } else {
                    double val = Double.parseDouble(value);
                    System.out.println("double -> " + val);
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Hey! That’s not a value! Try once more.");
            }
        }
    }

    /**
     * What do you think about raising an exception: when should we raise an exception and when return Null on method „failure”? Try to implement one method
     * for each situation.
     */
    public static void ex2() {

        try {

            String result = searchInArrayWithException("masina");
            System.out.println(result.length());

        } catch (ElementNotFoundException elementNotFoundException) {
            System.out.println(elementNotFoundException.getMessage());
        }

        String result2 = searchInArray("masina");
        if(result2 != null) {
            System.out.println(result2.length());
        }

    }

    public static String searchInArray(String item) {
        String [] items = {"car", "bike", "phone", "key"};

        for(String element : items) {
            if (item.equalsIgnoreCase(element)) {
                return element;
            }
        }

        // daca nu a gasit nici un element egal cu item
        return null;
    }

    public static String searchInArrayWithException(String item) throws ElementNotFoundException {
        String [] items = {"car", "bike", "phone", "key"};

        for(String element : items) {
            if (item.equalsIgnoreCase(element)) {
                return element;
            }
        }

        // daca nu a gasit nici un element egal cu item
        throw new ElementNotFoundException("Elementul \"" + item + "\" nu a fost gasit");
    }
}
