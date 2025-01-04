package arrays;

public class TwoArraysEqualOrNot {

    public static boolean checkArraysEqual(int[] a, int[] b){


        if (a.length == b.length){

            for (int i = 0; i<a.length; i++){

                if (a[i] != b[i]){
                    return false;
                } else if (a[i] == b[i]){
                    continue;
                }
            }

        }else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int a[] = {10, 20, 30};
        int b[] = {10, 20, 30};

        System.out.println(checkArraysEqual(a, b));
    }
}
