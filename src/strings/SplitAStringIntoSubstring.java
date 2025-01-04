package strings;

public class SplitAStringIntoSubstring {

    public static void splitAStringIntoSubstring(String str){

        String finalString = new String();
        int count = 1;
        for (int i = 0; i<str.length(); i++){

            for (int j = i; j<str.length(); j++){

                finalString += str.charAt(j);
                System.out.println(count+ " " + finalString);
            }
            finalString = "";

        }
    }

    public static void main(String[] args) {

        String str = "The Cat";
        splitAStringIntoSubstring(str);
    }
}
