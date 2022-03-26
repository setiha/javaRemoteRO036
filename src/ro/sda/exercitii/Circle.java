package ro.sda.exercitii;

public class Circle extends Shape {

    private int raza;

    public Circle(int raza) {
        super();
        this.raza = raza;
    }

    @Override
    public void calculatePerimetru() {
        int perimetru = (int) (2*Math.PI * this.raza);
        super.setPerimetru(perimetru);
    }

    @Override
    public void calculateArie() {
        int arie = (int) (Math.PI * this.raza * this.raza);
        super.setArie(arie);

    }
}
