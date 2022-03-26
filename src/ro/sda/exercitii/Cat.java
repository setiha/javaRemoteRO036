package ro.sda.exercitii;

public class Cat extends Animal{

    public Cat(String name, int age, String gen, double greutate) {
        super(name, age, gen, greutate);
    }

    @Override
    public void yeldVoice() {
        System.out.println("Cat -> miau");
    }
}
