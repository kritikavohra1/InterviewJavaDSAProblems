package strings;

public class MergeCharactersOfTwoStringsAlernatively {

    public static String mergeStrings(String s1, String s2){

        char[] s1CharArr = s1.toCharArray();
        char[] s2CharArr = s2.toCharArray();
        String finalString = new String();

        if (s1CharArr.length > s2CharArr.length){
            for (int i = 0; i<s1CharArr.length; i++){
                finalString += s1.charAt(i);

                if (i< s2CharArr.length){
                    finalString += s2.charAt(i);
                }
            }
        } else {
            for (int i = 0; i<s2CharArr.length; i++){

                if (i< s1CharArr.length){
                    finalString += s1.charAt(i);
                }
                finalString += s2.charAt(i);
            }

        }

        return finalString;
    }

    public static void main(String[] args) {

        String s2 = "Hello";
        String s1 = "def";
        System.out.println(mergeStrings(s1, s2));
    }
}
