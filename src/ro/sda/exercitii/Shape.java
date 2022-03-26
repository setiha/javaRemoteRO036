package ro.sda.exercitii;

public abstract class Shape {
    private int perimetru;
    private int arie;

    public Shape() {

    }

    public abstract void calculatePerimetru();

    public abstract void calculateArie();

    public int getPerimetru() {
        return perimetru;
    }

    public void setPerimetru(int perimetru) {
        this.perimetru = perimetru;
    }

    public int getArie() {
        return arie;
    }

    public void setArie(int arie) {
        this.arie = arie;
    }
}
