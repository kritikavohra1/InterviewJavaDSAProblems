package arrays;

import java.util.HashSet;

public class RemoveSortedFromDuplicateElements {

    public static void removeSorted(int[] arr){

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i< arr.length; i++){

            if (!hashSet.contains(arr[i])){
                hashSet.add(arr[i]);
            }
        }

        System.out.println(hashSet.toString());
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        removeSorted(arr);
    }
}
