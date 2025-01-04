package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrays {

    public static void mergeUsingArrayList(int[] arr1, int[] arr2){

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i<arr1.length; i++){

            arrayList.add(arr1[i]);
        }

        for (int i = 0; i<arr2.length; i++){

            arrayList.add(arr2[i]);
        }

        System.out.println(arrayList.toString());
    }

    public static void mergeTwoArrays(int[] arr1, int[] arr2){

        int firstLength = arr1.length;
        int secondLength = arr2.length;
        int totalLength = firstLength + secondLength;
        int[] mergeArr = new int[totalLength];
        int j = 0;

        for (int i = 0; i<firstLength; i++){

            mergeArr[j] = arr1[i];
            j++;
        }

        for (int k = 0; k<secondLength; k++){

            mergeArr[j] = arr2[k];
            j++;
        }

        for (int i = 0; i<j; i++){
            System.out.println(mergeArr[i]);
        }


    }

    public static void main(String[] args) {

        int[] arr1 = { 10, 20, 30, 40 };
        int[] arr2 = {50, 60, 70, 80};
       // mergeTwoArrays(arr1, arr2);
        mergeUsingArrayList(arr1, arr2);
    }
}
