package ro.sda.exercitii;

public class Rectangle extends Shape {
    private int lungime;
    private int latime;

    public Rectangle(int lungime, int latime) {
        super();
        this.lungime = lungime;
        this.latime =latime;
    }

    @Override
    public void calculatePerimetru() {
        int perimetru = (this.latime + this.lungime)*2;
        super.setPerimetru(perimetru);
    }

    @Override
    public void calculateArie() {
        int arie = this.latime * this.lungime;
        super.setArie(arie);
    }
}
