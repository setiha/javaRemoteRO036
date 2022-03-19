package ro.sda.exercitii;

import java.util.Scanner;

public class Employee {

    private String firstName = "Te";
    private String lastName = "Mi";
    private int age = 10;
    private int dateOfBirth = 1977;
    private double salary = 875.44D;

    public Employee() {

    }

    public Employee(String firstName, String lastName, int age, int dateOfBirth, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();

        Employee employee2 = new Employee("Harab", "Alb", 34, 1978, 3200.30);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti prenumele angajatului: ");
        this.firstName = scanner.nextLine();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele angajatului: ");
        this.lastName = scanner.nextLine();
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti varsta angajatului: ");
        this.age = scanner.nextInt();
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti data de nastere al angajatului: ");
        this.dateOfBirth = scanner.nextInt();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti salariul angajatului: ");
        this.salary = scanner.nextDouble();
    }

    public boolean printEmployee() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Date of birth " + this.dateOfBirth);
        System.out.println("Salary: " + this.salary);
        return false;
    }

}
