package ro.sda.curs9.inheritance;

public class Vehicle {
    private int wheelsNumber;
     private  String color;
    private double maxSpeed;

    public Vehicle() {
    }

    public Vehicle(int wheelsNumber, String color, double maxSpeed) {
        this.wheelsNumber = wheelsNumber;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
