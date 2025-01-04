package arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr){

//        for (int i = arr.length-1; i>=0; i--){
//            System.out.print(arr[i]+" ");
//        }

        int[] temp = new int[arr.length];
        int x = 0;
        for (int i = arr.length-1; i>=0; i--){
            temp[x] = arr[i];
            x++;
        }

        for (int i = 0; i< temp.length; i++){
            System.out.println(temp[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        reverseArray(arr);
    }
}
