package strings;

import java.util.Arrays;

public class SortAStringInJava {

    public static void sortString(String str){

        char[] newArr = str.toCharArray();

        for (int i = 0; i< newArr.length; i++){

            for (int j = i+1; j< newArr.length; j++){

                if (newArr[i] > newArr[j]){

                    char temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }

        for (int i = 0; i< newArr.length; i++){
            System.out.print(newArr[i]);
        }
    }

    public static void main(String[] args) {

        String str = "geeksforgeeks";
        str.toCharArray();
        //sortString(str);
        char[] str1 = str.toCharArray();
        Arrays.sort(str1);
        System.out.println(new String(str1));
    }
}
