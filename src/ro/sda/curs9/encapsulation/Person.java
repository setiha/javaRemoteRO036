package ro.sda.curs9FivePrinciples.encapsulation;

public class Person {
    // toate proprietatile unei clase sunt variabile GLOBALE

    private String name; // proprietate clasa
    private String phone;
    private int age;

    // constructorul are acelasi nume cu clasa
    // nu are tip returnat
    // constructorul default este un constructor fara parametrii si blocul de cod este gol
    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String phone, int age) {
        // parametrii unei metode / constructor sunt variabile locale in metoda / constructorul respectiv.

        // this -> face referire la proprietatile clasei in care ne aflam
        // this -> se foloseste in metode, contructori
        // this -> se foloseste pentru a apela proprietati this.name, metode this.printMoney() sau contructori this()

//        this.name = name;

        this.setName(name);

        // apelam metoda prinMoney() din clasa curenta
//        this.printMoney();

        // apelam un construtor
//        this("Catalin");

    }

    public void printMoney() {
        System.out.println("Persoana cu numele: " + this.name + " are datorie 190 lei");
    }

    // setter si getter - sunt metode care ne ajuta sa controlam valoarea proprietatilor din clasa
    public void setName(String name) {
        // .trim() elimina toate spatiile din string
        if(name.trim().length() == 0) {
            System.out.println("Nume invalid");
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addOneYear() {
        this.age += 1;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + this.customAgeText() +
                '}';
    }

    /**
     * Dar scopul metodei toString() este exact ce avem mai jos.
     * @return proprietatile din clasa Person sub forma de String
     */
    public String printPerson() {
        return "Person: " +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + this.customAgeText() +
                '}';
    }

    private String customAgeText() {
        if(this.age < 18) {
            return "Minor";
        } else {
            return "Adult";
        }
    }
}
