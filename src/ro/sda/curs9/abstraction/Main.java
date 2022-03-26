package ro.sda.curs9.abstraction;

public class Main {

    public static void main(String[] args) {
        Angajat angajat = new Angajat("Catalin", 30, 25) {
            //implementarea metodei abstracta
            //intro variabila avem definita o clasa anonima
            //proprietate anonima pentru ca nu este definita in clasa angajat
            String message = "bun venit";

            @Override
            public void pontareCheckIn() {

            }

            @Override
            public void pontareCheckOut() {

            }

            @Override
            public void getZiLibera(String date) {

            }

            @Override
            public double CalculateSalaryBonus() {
                return 1 + 2;
            }

            //metoda anonime pentru ca nu este definita in clasa angajat
            public void printMessage() {
                System.out.println(this.message);
            }
        };

        Angajat angajat2 = new Angajat("Bogdan", 55, 30) {
            int bonus = 10;

            @Override
            public void pontareCheckIn() {

            }

            @Override
            public void pontareCheckOut() {

            }

            @Override
            public void getZiLibera(String date) {

            }

            @Override
            public double CalculateSalaryBonus() {
                return 2 + 3;
            }
        };

        Angajat angajat3 = new Contabil("Cata", 40, 20);
        int sum1 = calculateAB((a, b) -> a * b);

        int sum2 = calculateAB(new FunctionalInterfaceExample() {
            @Override
            public int calculateAB(int a, int b) {
                return a + b;
            }
        });
        int sum3 = calculateAB(new FunctionalInterfaceExample() {
            @Override
            public int calculateAB(int a, int b) {
                return a-b;
            }
        });

        System.out.println("Sum: " + sum1 + "Sum2: " + sum2);
        System.out.println("sum3: "+ sum3);
        Math math = new Math();
        math.calculateAB(2,3);
    }

    public static void testFunctionalInterface() {
        FunctionalInterfaceExample interfaceExample = new FunctionalInterfaceExample() {
            @Override
            public int calculateAB(int a, int b) {
                return a + b;
            }
        };
        // Lambda Expiration
        FunctionalInterfaceExample functionalInterfaceExample1 = (int a, int b) -> a + b;
        FunctionalInterfaceExample functionalInterfaceExample2 = (a, b) -> a + b;
    }

    public static int calculateAB(FunctionalInterfaceExample example) {
        return example.calculateAB(2, 3);

    }
}