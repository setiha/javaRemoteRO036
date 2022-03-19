package ro.sda.curs4;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Persoana persoana1 = new Persoana();
        persoana1.setNume("Sebok");
        persoana1.setPrenume("Tihamer");
        System.out.println(persoana1.getFullName());
    }

}
