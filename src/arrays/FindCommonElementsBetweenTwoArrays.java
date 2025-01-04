package arrays;

import java.util.HashSet;

public class FindCommonElementsBetweenTwoArrays {

    public static void findCommonElements(String[] arr1, String[] arr2){

        HashSet<String> hashSet = new HashSet<>();
        int index = 0;

        for (int i = 0; i< arr1.length; i++){

            for (int j = 0; j< arr2.length; j++){

                if (arr1[i] == arr2[j]){
                    hashSet.add(arr1[i]);
                    index++;
                }
            }
        }

        System.out.println(hashSet.toString());
    }

    public static void main(String[] args) {

        String[] arr1 = {"a", "b", "c", "d", "e", "f"};
        String[] arr2 = {"b", "d", "e", "h", "g", "c"};

        String[] arr3 = { "Article", "in", "Geeks", "for", "Geeks" };
        String[] arr4 = { "Geeks", "for", "Geeks" };

        findCommonElements(arr1, arr2);
        findCommonElements(arr3, arr4);
    }
}
