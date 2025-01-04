package strings;

import java.util.Locale;
import java.util.Objects;

public class CompareTwoStrings {

    public static boolean compareTwoString(String st1, String str2){

        if (st1.length() == str2.length()){

            for (int i = 0; i<st1.length(); i++){

                if (st1.charAt(i) == str2.charAt(i)){

                    continue;
                }else {
                    return false;
                }
            }

        } else {
            return false;
        }
        return true;
    }

    public static int compareTwoStrings(String st1, String str2){

        if (st1.length() == str2.length()){

            for (int i = 0; i<st1.length(); i++){

                if ((int)st1.charAt(i) == (int)str2.charAt(i)){

                    continue;
                }else {
                    return (int)st1.charAt(i) - (int)str2.charAt(i);
                }
            }

        } else {
            return st1.length() - str2.length();
        }
        return 0;
    }

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Geeks";
        String s3 = "Hello";
        String s4 = new String("Hello");
        String s5 = "HELLO";

//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equals(s4));
//        System.out.println(s1==s3);
//        System.out.println(s1==s4);
//        System.out.println(s1.compareTo(s3));
//        System.out.println(s1.compareTo(s4));
//        System.out.println(s1.equalsIgnoreCase(s5));
//        System.out.println(Objects.equals(s1, s3));
//        System.out.println(s1.compareTo(s3));

        System.out.println(compareTwoString(s1.toLowerCase(), s3.toLowerCase()));
        System.out.println(compareTwoStrings(s1.toLowerCase(), s2.toLowerCase()));
    }
}
