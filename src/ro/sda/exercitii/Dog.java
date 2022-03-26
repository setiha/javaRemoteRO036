package ro.sda.exercitii;

public class Dog extends  Animal{

    public Dog(String name, int age, String gen, double greutate) {
        super(name, age, gen, greutate);
    }

    @Override
    public void yeldVoice() {
        System.out.println("Dog -> vau");
    }
}
