package arrays;

public class CopyAnArrayInJava {

    public static void copyArray(int[] arr){

        int[] b = new int[arr.length];

        for (int i = 0; i< arr.length; i++){

            b[i] = arr[i];
        }

        for (int i = 0; i< arr.length; i++){
            System.out.println(b[i]);
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3,4, 5, 6};
        copyArray(a);
    }
}
