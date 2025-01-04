package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortDescending {

    public static void sortDescenting(int[] arr){

        int temp = 0;

        for (int i = 0; i< arr.length; i++){

            for (int j = i+1; j< arr.length; j++){
                if (arr[i] <arr[j]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int x=0; x< arr.length; x++){
            System.out.println(arr[x]);
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, -1, 3, 4};
        sortDescenting(a);

        Integer[] b = { 2, -1, 3, 4};
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println(Arrays.toString(b));

        String str[] = { "practice.geeksforgeeks.org",
                "www.geeksforgeeks.org",
                "code.geeksforgeeks.org" };

        Arrays.sort(str, Collections.reverseOrder());
        System.out.println(Arrays.toString(str));
    }
}
