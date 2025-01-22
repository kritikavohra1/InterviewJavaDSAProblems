package strings;

/**
 *
 * Find the first occurrence of the string pat in the string txt.
 * The function returns an integer denoting the first occurrence of the string pat in txt (0-based indexing).
 */

public class FirstOccurrance {

    public static int findFirstOccurrance(String txt, String pat){

        char[] charArr = txt.toCharArray();
        String checkStr = new String();
        int index = -1;

        for (int i = 0; i<charArr.length; i++){

            if (txt.charAt(i) == pat.charAt(0)){

                index = i;
                for (int j = 0; j<pat.length(); j++){

                    if (txt.charAt(i) == pat.charAt(j)){
                        checkStr += String.valueOf(txt.charAt(i));
                        i++;
                    } else {
                        break;
                    }
                }
            }
        }

        if (checkStr.equals(pat)){

            return index;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        String txt = "GeeksForGeeks";
        String pat = "For";

        System.out.println(findFirstOccurrance(txt, pat));
    }
}
