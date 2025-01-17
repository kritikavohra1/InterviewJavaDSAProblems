package strings;

/**
 * In this problem, a String S is composed of lowercase alphabets and wildcard characters i.e. '?'. Here, '?' can be replaced by any of the lowercase alphabets. Now you have to classify the given String on the basis of following rules:
 *
 * If there are more than 3 consonants together or more than 5 vowels together, the String is considered to be "BAD". A String is considered "GOOD" only if it is not “BAD”.
 *
 * NOTE: String is considered as "BAD" if the above condition is satisfied even once. Else it is "GOOD" and the task is to make the string "BAD".
 */
public class GoodOrBadString {

    public static String findGoodOrBadString(String str){

        int vowelCount = 0;
        int consonentCount = 0;

        if (str.length() > 3){

            for (int i = 0; i<str.length(); i++){

                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) =='i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){

                    vowelCount++;
                    consonentCount = 0;
                } else if (str.charAt(i) == '?') {
                    vowelCount++;
                    consonentCount++;
                }else {
                    vowelCount = 0;
                    consonentCount++;
                }
            }
        }

        if (vowelCount > 5 || consonentCount > 3){

            return "BAD";
        }else {
            return "GOOD";
        }

    }

    public static void main(String[] args) {

        String s1 = "aeioup??";
        String s2 = "bcdaeiou??";
        System.out.println(findGoodOrBadString(s1));
        System.out.println(findGoodOrBadString(s2));
    }
}
