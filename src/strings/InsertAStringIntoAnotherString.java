package strings;

public class InsertAStringIntoAnotherString {

    public static void insertUsingSubstring(String str, String additionalString, int index){

        String finalString = str.substring(0, index+1) + additionalString + str.substring(index+1);
        System.out.println(finalString);
    }

    public static void insertUsingStringBuffer(String str, String additionalString, int index){

        StringBuffer finalString = new StringBuffer(str);
        finalString.insert(index+1, additionalString);
        System.out.println(finalString);
    }
    public static void insertUsingString(String str, String additionalString, int index){

        String finalString = new String();

        for (int i = 0; i<str.length(); i++){

            finalString += str.charAt(i);
            if (i == index){
                finalString += additionalString;
            }
        }

        System.out.println(finalString);
    }

    public static void main(String[] args) {

        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;
        insertUsingString(originalString, stringToBeInserted, index);
        insertUsingSubstring(originalString, stringToBeInserted, index);
        insertUsingStringBuffer(originalString, stringToBeInserted, index);

    }
}
