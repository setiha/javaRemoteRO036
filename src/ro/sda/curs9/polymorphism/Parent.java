package ro.sda.curs9FivePrinciples.polymorphism;

public class Parent {

    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Parent: " + name);
    }


    public String getName() {
        return this.name;
    }
}
