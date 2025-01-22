package strings;

public class ReverseWordsInString {

    public static String reverseWords(String str){

        String[] strArr = str.split("\\s");
        String finalString = new String();

        for (int i = strArr.length-1; i>=0; i--){
            finalString += strArr[i] + " ";
        }

        return finalString.trim();
    }

    public static void main(String[] args) {

        String str = " i like this program very much ";
        System.out.println(reverseWords(str.trim()));

    }
}
