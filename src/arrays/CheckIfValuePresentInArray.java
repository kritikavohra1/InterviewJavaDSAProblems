package arrays;

import java.util.ArrayList;
import java.util.List;

public class CheckIfValuePresentInArray {

    static public boolean checkValuePresent(int[] arr, int key){

        for (int i = 0; i<arr.length; i++){

            if (arr[i]==key){
                return true;
            }
        }
        return false;
    }

    static boolean binarySearch(int[] arr, int key){

        int temp=0;
        for (int i = 0; i< arr.length; i++){

            for (int j = i+1;j< arr.length; j++){

                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        for (int i = 0; i< arr.length; i++){
            if (arr[i]==key){
                return true;
            }
        }
    return false;
    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 1, 9, 7, 2, 6, 10};
        int key = 7;
        System.out.println("Is "+key+" present in the array: "+checkValuePresent(arr, key));
        System.out.println("Is "+key+" present in the array: "+binarySearch(arr, key));

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(5, 1, 1, 9, 7, 2, 6, 10));
        System.out.println(arrayList.contains(key));
    }
}
