package ro.sda.curs9.composition;

public class Bed {
    private int length;
    private int width;

    public Bed(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }


    @Override
    public String toString() {
        return "Bed: " +
                "length: " + length +
                ", width: " + width;
    }
}
