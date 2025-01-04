package arrays;

public class RotateLeftByNElements {

    public static void rotateLeftByNElements(int[] arr, int d){

        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = d; i< arr.length-1; i++){

            temp[j] = arr[i];
            j++;
        }

        temp[j++] = arr[arr.length-1];

        for (int i = 0; i<d; i++){
            temp[j++] = arr[i];
        }

        for (int i = 0; i< arr.length; i++){
            System.out.println(temp[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        rotateLeftByNElements(arr, d);
    }
}
