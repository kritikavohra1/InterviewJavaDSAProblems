package arrays;

import java.util.HashSet;

public class RemoveDuplicateElements {

    public static void removeDuplicateUsingHashSet(int[] arr){

        HashSet<Integer> hashSet = new HashSet<>();
        int j = 0;

        for (int i = 0; i<arr.length; i++){

            if (!hashSet.contains(arr[i])){
                hashSet.add(arr[i]);
                arr[j] = arr[i];
                j++;
            }
        }

        for (int k = 0; k<j; k++){
            System.out.println(arr[k]);
        }
    }

    public static void removeDuplicate(int[] arr){

        int original_array_length = arr.length;
        int[] temp = new int[original_array_length];
        int j = 0;

        for (int i = 0; i<original_array_length-1; i++){

            if (arr[i] != arr[i+1]){
                temp[j] = arr[i]; //1, 2, 3, 4, 5, 6
                j++;
            }
        }

        temp[j++] = arr[original_array_length-1];

        for (int i = 0; i< j; i++){
            System.out.println(temp[i]);
        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
       // removeDuplicate(arr);
        removeDuplicateUsingHashSet(arr);
    }
}
