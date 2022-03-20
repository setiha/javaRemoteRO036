package ro.sda.curs9FivePrinciples.polymorphism;

public class Child extends Parent{

    public Child(String name){
        super(name);
    }

    @Override
    public void showName(){
        System.out.println("Child: " + super.getName());
    }
    public  void childMethod(){
        System.out.println("Child method");
    }
}
