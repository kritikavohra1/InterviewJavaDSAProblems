package arrays;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        char[] ca = {'a', 'z', 'w', 'b'};

        int[] ia = {1, 55, 22, 33};
        System.out.println(Arrays.toString(ia));

        Arrays.sort(ia);
        Arrays.sort(ca);

        for (int i = 0; i< ia.length; i++){
            System.out.println(ia[i]);
        }

        for (int c = 0; c< ca.length; c++){
            System.out.println(ca[c]);
        }

        System.out.println("-------------");
        int[] a = { 2, -1, 4, 3};

        Arrays.sort(a, 1, 4);
        System.out.println(Arrays.toString(a));
    }
}
