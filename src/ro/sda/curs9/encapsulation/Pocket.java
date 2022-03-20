package ro.sda.curs9FivePrinciples.encapsulation;

public class Pocket {
    private double money;

    public Pocket(double money) {
        this.money = money;
    }

    public double getMoney() {
        if(this.money <= 10) {
            return 0;
        }

        return money;
    }

    public void setMoney(double money) {
        if(this.money < -10 || this.money > 3000) {
            System.out.println("I don't have enough space in my pocket for as much money!");
        } else {
            this.money = money;
        }
    }
}
