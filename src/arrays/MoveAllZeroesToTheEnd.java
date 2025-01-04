package arrays;

public class MoveAllZeroesToTheEnd {

    public static void moveALlZeroToEnd(int[] arr){

        int[] temp1 = new int[arr.length];
        int[] temp2 = new int[arr.length];
        int[] temp3 = new int[arr.length];
        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i<arr.length; i++){

            if (arr[i]!=0){
                temp1[x] = arr[i];
                x++;
            } else if (arr[i] == 0) {
                temp2[y] = arr[i];
                y++;
            }
        }

        for (int i = 0; i< x; i++){
            temp3[z] = temp1[i];
            z++;
        }

        for (int i = 0; i< y; i++){
            temp3[z] = temp2[i];
            z++;
        }

        for (int i = 0; i< temp3.length; i++){
            System.out.print(temp3[i]+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveALlZeroToEnd(arr);

    }
}
