package ro.sda.curs9FivePrinciples.composition;

public class TvSamsung {
    private int size;
    private String color;
    private boolean isSmart;

    public TvSamsung(int size, String color, boolean isSmart) {
        this.size = size;
        this.color = color;
        this.isSmart = isSmart;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean isSmart() {
        return isSmart;
    }

    @Override
    public String toString() {
        return "TvSamsung: " +
                "size: " + size +
                ", color: " + color  +
                ", isSmart: " + isSmart + ".";
    }
}
