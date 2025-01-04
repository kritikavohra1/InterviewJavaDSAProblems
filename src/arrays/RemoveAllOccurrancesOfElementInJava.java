package arrays;

public class RemoveAllOccurrancesOfElementInJava {

    public static void removeOccurrances(int[] arr, int key){

        int temp[] = new int[arr.length];
        int index = 0;

        for (int i = 0; i< arr.length; i++){

            if (arr[i] != key){
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i<index; i++){
            System.out.println(temp[i]);
        }
    }

    public static void main(String[] args) {

        int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int key = 3;
        removeOccurrances(array, key);
    }
}
