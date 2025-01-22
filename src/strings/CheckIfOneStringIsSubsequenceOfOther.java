package strings;

/**
 * Given two strings s1 and s2, find if the first string is a Subsequence of the second string,
 * i.e. if s1 is a subsequence of s2.  A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.
 */

public class CheckIfOneStringIsSubsequenceOfOther {

    public static boolean checkSubsequence(String s1, String s2){

        char[] newArr = s2.toCharArray();
        String compareStr = new String();

        for (int i = 0; i<newArr.length; i++){

            for (int j = 0; j<s1.length(); j++){

                if (newArr[i] == s1.charAt(j)){

                    compareStr += newArr[i];
                    i++;
                }
            }
        }

        System.out.println(compareStr);
        if (compareStr.equals(s1)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s1 = "AXY";
        String s2 = "ADXCPY";
        String s3 = "YADXCP";
        System.out.println(checkSubsequence(s1, s2));
        System.out.println(checkSubsequence(s1, s3));
    }
}
