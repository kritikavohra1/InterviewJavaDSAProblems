package arrays;

import java.util.HashSet;

public class Largest3DistinctElements {

    public static void getThreeLargest(int arr[]) {
        // code here
        int temp = 0;

        for(int i = 0; i<arr.length; i++){

            for(int j = i+1; j<arr.length; j++){

                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Largest element: "+arr[arr.length-1]);


        System.out.println("Second largest element: "+arr[arr.length-2]);

    }

    public static void main(String[] args) {

        int[] arr = {10, 4, 3, 50, 23, 90, 90};
        getThreeLargest(arr);
    }
}
