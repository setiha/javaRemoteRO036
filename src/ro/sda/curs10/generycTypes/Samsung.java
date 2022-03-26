package ro.sda.curs10.generycTypes;

public class Samsung extends Phone {

    private String color;

    public Samsung(String brand, String model, String color) {
        super(brand, model);

        this.color = color;
    }

    @Override
    public void printPhoneDetails() {
        String details = "Samsung Class: " + super.getBrand() + super.getModel() + "-" + this.getColor();
        System.out.println(details);

    }

    public String getColor() {
        return color;
    }
}
