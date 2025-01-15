package strings;

public class SortStringInDescendingOrder {

    public static String sortStringInDescendingOrder(String str){

        char[] newArr = str.toCharArray();

        for (int i = 0; i<newArr.length; i++){

            for (int j = i+1; j< newArr.length; j++){

                if (newArr[i] < newArr[j]){

                    char temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }

        return String.valueOf(newArr);
    }

    public static void main(String[] args) {

        String str = "geeks";
        System.out.println(sortStringInDescendingOrder(str));
    }
}
