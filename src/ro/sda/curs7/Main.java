package ro.sda.curs7;

import java.time.Year;
/*2.Definiti clasa Student ce contine: nume, prenume, varsta, anulAbsolvirii, medie. Scrieti un program care citeste de la tastatura un numar
    n - numarul studentilor, creati un vector de studenti si setati pentru fiecare student campurile respectice.
            a) Afisati toti studentii.
            b) Scrieti o functie care cauta un student dupa nume si il afiseaza;
    c) afisati studentul cu media cea mai mare;
    d) verificati daca anul absolvirii pentru un student anume este an bisect.
            BONUS: e) sortati vectorul in functie de medie si afisati pe ecran*/

public class Main {
    public static void studentSortByGpa(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                Student bestStudent;
                if (array[i].medieAbsolvire > array[k].medieAbsolvire) {
                    bestStudent = array[i];
                    array[i] = array[k];
                    array[k] = bestStudent;
                }
            }
        }
    }

    public static void studentSearch(Student[] array, String name, String firstName) {
        for (Student s : array) {
            if (s.nume.equals(name) && s.prenume.equals(firstName)) {
                s.afisareStudent();
                int daysInYear = Year.of(s.anulAbsolvirii).length();
                if (daysInYear > 365) {
                    System.out.println("Anul absolvirii e an bisect");
                } else {
                    System.out.println("Anul absolvirii nu e un an bisect");
                }
            }
        }
    }

    public static void highestGPA(Student[] array) {
        Student smartestStudent = new Student();
        for (Student s : array) {
            if (s.medieAbsolvire > smartestStudent.medieAbsolvire) {
                smartestStudent = s;
            }
        }
        System.out.println("Studentul cu cea mai mare medie de absolvire: " + smartestStudent.nume + " " + smartestStudent.prenume);
    }

    public static void main(String[] args) {
        Student[] studentsArray = new Student[5];
        studentsArray[0] = new Student("Popa", "Ioan", 23, 2000, 9.16);
        studentsArray[1] = new Student("Bill", "Gates", 30, 2005, 7.60);
        studentsArray[2] = new Student("Dio", "Zepam", 26, 2006, 7.80);
        studentsArray[3] = new Student("Diego", "Maradona", 50, 1985, 6.60);
        studentsArray[4] = new Student("Merce", "Des", 77, 2010, 9.90);

        /*for (Student j : studentsArray) {
            System.out.println(j.afisareStudent());
        }*/
        //studentSearch(studentsArray, "Bill", "Gates");
        //highestGPA(studentsArray);

        studentSortByGpa(studentsArray);
        for (Student s : studentsArray) {
            System.out.println(s.afisareStudent());
        }
    }

}
