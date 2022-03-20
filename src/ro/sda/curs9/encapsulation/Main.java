package ro.sda.curs9FivePrinciples.encapsulation;

import ro.sda.exercitii.Pocket;

public class Main {
    public static void main(String[] args) {
        Pocket pocket = new Pocket(-5);
        System.out.println(pocket.getMoney());
        pocket.setMoney(-10);
        pocket.setMoney(4000);
    }
}
