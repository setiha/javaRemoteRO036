package ro.sda.exercitii;

import java.util.Scanner;

public class Employer {
    private Employee[] employees;
    private int employeeNumber;
    private String employerName;
    private double mediaOfSalaries;

    public Employer() {

    }

    public static void main(String[] args) {
        Employer one = new Employer();
        one.setEmployeeNumber();
        one.setEmployeesArray(one.getEmployeeNumber());
        System.out.println("Media salariala al angajatilor: " + one.getMediaSalaries());
        one.sortEmployeeArrayBySalary(one.getEmployees());

    }

    public void setMediaOfSalaries(Employee[] array) {
        double counter = 0;
        for (Employee e : array) {
            counter = counter + (e.getSalary());
        }
        mediaOfSalaries = counter / array.length;
    }

    public Double getMediaSalaries() {
        return mediaOfSalaries;
    }

    public void sortEmployeeArrayBySalary(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                Employee bestPaidEmployee;
                if (array[i].getSalary() > array[j].getSalary()) {
                    bestPaidEmployee = array[i];
                    array[i] = array[j];
                    array[j] = bestPaidEmployee;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            array[i].printEmployee();
        }
    }

    public void setEmployeesArray(int number) {
        employees = new Employee[number];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            employees[i].setFirstName();
            employees[i].setLastName();
            employees[i].setAge();
            employees[i].setDateOfBirth();
            employees[i].setSalary();
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println();
            employees[i].printEmployee();
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul angajatilor: ");
        this.employeeNumber = scanner.nextInt();

    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

}
