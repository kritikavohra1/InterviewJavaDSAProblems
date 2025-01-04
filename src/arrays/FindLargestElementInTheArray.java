package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class FindLargestElementInTheArray {

    public static void findLargestElement(int[] arr){

        int temp = 0;

        for (int i = 0; i<arr.length; i++){

            for (int j=i+1; j<arr.length; j++){

                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        int lastElement = arr[arr.length-1];
        int secondLargestElement = arr[arr.length-2];
        System.out.println("Largest element of array: "+lastElement);
        System.out.println("Second largest element of array: "+secondLargestElement);


    }

    public static int findMax(int[] arr){

        int max = arr[0];

        for (int i = 0; i<arr.length; i++){

            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findsecondMax(int[] arr){

        int max = arr[0];
        int secondMax = -1;

        for (int i = 0; i<arr.length; i++){

            if (arr[i] > max){
                max = arr[i];
            }
        }

        for (int i = 0; i<arr.length; i++){
            if (arr[i] > secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static int oneforloopFindSecondMax(int[] arr){

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i<arr.length; i++){

            if (arr[i] >largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {

                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void findMaxUsingList(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<arr.length; i++){
            list.add(arr[i]);
        }

        System.out.println(Collections.max(list));
    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 1, 9, 7, 2, 6, 10};
        //System.out.println(arr.length);
        findLargestElement(arr);
        System.out.println("-------------");
        System.out.println(findMax(arr));
        System.out.println("Second largest element");
        System.out.println(findsecondMax(arr));
        System.out.println("Second largest using one for loop");
        System.out.println(oneforloopFindSecondMax(arr));
        findMaxUsingList(arr);
    }
}
