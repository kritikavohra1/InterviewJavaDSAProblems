package arrays;

public class RotateRightByNElements {

    public static void rotateRightByN(int[] arr, int d){

        int[] temp = new int[arr.length];
        int j = d;
        int x = arr.length;

        for (int i = 0; i< arr.length-d; i++){
            temp[j] = arr[i];
            j++;
        }

        for (int i = 0; i<d; i++){
            temp[i] = arr[x-1];
            x--;
        }

        for (int i = 0; i< temp.length; i++){
            System.out.println(temp[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotateRightByN(arr, d);
    }
}
