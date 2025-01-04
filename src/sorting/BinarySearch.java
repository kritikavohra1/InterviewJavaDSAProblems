package sorting;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key){

        int start = 0;
        int end = arr.length -1;

        while (start <= end){

            int mid = (start + end)/2;

            if (key > arr[mid]){
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {-1, 0, 3, 4, 5, 9, 12};
        int x = 12;
        System.out.println(binarySearch(arr, x));

        int[] arr1 = {-1, 0, 3, 4, 9, 12};
        int x1 = 0;
        System.out.println(binarySearch(arr1, x1));
    }
}
