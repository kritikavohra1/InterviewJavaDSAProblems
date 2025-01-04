package arrays;

public class LeadersInArray {

    public static void findLeader(int[] arr){

        int[] temp = new int[arr.length];
        int x = 0;

        for (int i = 0; i<arr.length; i++){

            int j;
            for (j = i+1; j< arr.length; j++){

                if (arr[i]<arr[j]){
                    break;
                }else if (arr[i] > arr[j]){
                    continue;
                }
            }
            if (j==arr.length){
                temp[x] = arr[i];
                x++;
            }
        }

        for (int i = 0; i< x; i++){
            System.out.println(temp[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeader(arr);
    }
}
