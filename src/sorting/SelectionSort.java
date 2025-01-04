package sorting;

public class SelectionSort {

    public static void selectionSort(int[] arr){

        for (int i = 0; i< arr.length-1; i++){

            int smallest_index = i;

            for (int j = i+1; j< arr.length; j++){

                if (arr[smallest_index] > arr[j]){
                    smallest_index = j;
                }
            }

            int temp = arr[smallest_index];
            arr[smallest_index] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 7, 8, 3, 7, 2 };
        selectionSort(arr);
    }
}
