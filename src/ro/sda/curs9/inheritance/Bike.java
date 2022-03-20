package ro.sda.curs9FivePrinciples.inheritance;

public class Bike  extends  Vehicle{

   private double weight;

   public Bike(double weight){
       //super(); //apelam constructorul default din clasa Vehicle
       //initializam proprietatiile din classa parinte cu valori predefinite
       super(2,"blue",40);
       this.weight = weight;

       super.setColor("red"); //superi apeleaza proprietati, metode din parinte
   }
}
