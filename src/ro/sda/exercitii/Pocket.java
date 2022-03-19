package ro.sda.exercitii;

public class Pocket {
    private double money;

    public Pocket(double money) {

    }

    public double getMoney() {
        if (this.money <= 0) {
            return 0;
        }
        return money;
    }

    public void setMoney(double money) {
        if (money < 0 || money > 3000) {
            System.out.println("I don't have enough space in my pocket for as much money!");
        }
        this.money = money;
    }
}
