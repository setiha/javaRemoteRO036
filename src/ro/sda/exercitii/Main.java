package ro.sda.exercitii;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArie();
        circle.calculatePerimetru();
        System.out.println("circle: Arie -> " + circle.getArie() + "perimetru -> " + circle.getPerimetru());

        Rectangle rectangle = new Rectangle(1, 2);
        rectangle.calculateArie();
        rectangle.calculatePerimetru();
        System.out.println("rectangle : Arie -> " + rectangle.getArie() + "perimetru -> " + rectangle.getPerimetru());

        Dog dog = new Dog("Dog",2, "Indiferent",10);
        dog.yeldVoice();

    }


}
