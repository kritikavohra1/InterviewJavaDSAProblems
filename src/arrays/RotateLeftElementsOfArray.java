package arrays;

public class RotateLeftElementsOfArray {

    public static void rotateLeft(int[] arr){

        int length = arr.length;
        int firstELement = arr[0];

        for (int i = 0; i< arr.length-1; i++){

            arr[i] = arr[i+1];
        }

        arr[length-1] = firstELement;
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateLeft(arr);

    }
}
