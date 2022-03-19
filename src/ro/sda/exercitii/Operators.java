package ro.sda.exercitii;

public class Operators {

    public static void main(String[] args) {
        int index = 0;
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        int y = 5;
        System.out.println(y);
        y++;
        int z = y;
        System.out.println(z);
        y++;
        int x = y;
        System.out.println(x);
        System.out.println();
        System.out.println(array[index++]);
        System.out.println(array[++index]);
        System.out.println(array[index]);
        char alma = 'a';
        char boca = 'b';
        System.out.println(alma /5.0);
        System.out.println(45- 19.4);
        //System.out.println(1.0/2 * 10.0);
    }
}
