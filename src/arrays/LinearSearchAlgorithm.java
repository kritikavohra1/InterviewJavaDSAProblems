package arrays;

public class LinearSearchAlgorithm {

    public static int linearSearch(int[] arr, int x){

        for (int i = 0; i<arr.length; i++){

            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 8, 30, 4, 5};
        int x = 1;
        System.out.println("Index of key "+x+" is "+linearSearch(arr, x));
    }
}
