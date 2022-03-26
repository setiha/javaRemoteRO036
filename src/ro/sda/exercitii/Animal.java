package ro.sda.exercitii;

public abstract class Animal {

    private String name;
    private int age;
    private String gen;
    private double greutate;

    public Animal(String name, int age, String gen, double greutate) {
        this.name = name;
        this.age = age;
        this.gen = gen;
        this.greutate = greutate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public abstract void yeldVoice();
}
