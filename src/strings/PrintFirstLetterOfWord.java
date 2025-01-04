package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintFirstLetterOfWord {

    public static void main(String[] args) {

        String str = "Geeks for geeks";
        String[] str1 = str.split(" ");

        for (int i = 0; i<str1.length; i++){
            System.out.print(str1[i].charAt(0));
        }

    }
}
