package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseAString {

    public static void reverseString(String str){

        char[] newArr = str.toCharArray();

        for (int i = newArr.length-1; i>=0; i--){
            System.out.print(newArr[i]);
        }
    }

    public static void main(String[] args) {

        String str = "Geeks";
        reverseString(str);

        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println("");
        System.out.println(stringBuffer);
        System.out.println("");
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);


    }
}
