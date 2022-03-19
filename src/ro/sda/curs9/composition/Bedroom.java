package ro.sda.curs9.composition;

public class Bedroom {
    private TvSamsung tvSamsung;
    private Bed bed;

    public Bedroom() {
    }

    public TvSamsung getTvSamsung() {
        return this.tvSamsung;
    }

    public void setTvSamsung(TvSamsung tvSamsung) {
        if (tvSamsung.getSize() > 20 && tvSamsung.getColor() != null) {
            this.tvSamsung = tvSamsung;
        } else {
            System.out.println("Tv ul nu este valid");
        }
    }

    public void setBed(Bed bed) {
        if (bed.getLength() > 0 && bed.getLength() > bed.getWidth()) {
            this.bed = bed;
        } else {
            System.out.println("Bed ul este invalid");
        }

    }

    public String printDetails() {
        return "Tv: " + this.tvSamsung.getSize() + ", Bed: " + this.bed.getWidth() + "x" + this.bed.getLength();
    }

    @Override
    public String toString() {
        return printDetails();
    }
}
