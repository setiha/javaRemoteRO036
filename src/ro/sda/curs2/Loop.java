package ro.sda.curs2;

public class Loop {

    public static void main(String[] args) {
        //Afisam de patru ori Hello World

        //cunoastem numarul de pasi
        //pentru(initializare, conditie, modificarea variabilei)
        for (int i = 0; i < 3; i++) {
            //1.initializare variabila i cu 0
            //2. verificarea conditiei: i < 3;
            //3. incrementare i: 0,1,2
            //System.out.println("Hello World [" + i + "]");
            //System.out.println(i);
        }
        //nu cunoastem numarul de pasi
//        int i = 10;
//        while (i < 4) {
//            //executam blocul cat timp conditia din while e true
//            System.out.println("Hello world");
//            i++;
//        }


//        // la fel ca while dar execut codul cel putin o data inainte de a testa conditia
//        do {
//
//            System.out.println("Hello Wolrd");
//            ++i;
//
//        } while (i < 4);

        String[] array = {"Alice", "Al", "A"};
//        for (String element : array) {
//            System.out.println(element + "");
//        }
//
//        for (int index = 0; index < 3; index++) {
//            System.out.println(array[index]);
//        }

//        for (i = 0; i < 5; i++) {
//            System.out.println(i);
//            //break sparge loopul se foloseste cand am gasit ce cautam
//            break;
//        }

//        for (int index = 0; index <= 2; index++) {
//            System.out.println(array[index]);
//            if (array[index].equals("Al")) {
//                //break sparge loopul se foloseste cand am gasit ce cautam
//                break;
//            }
//        }

        for (int i = 0; i < 5; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
