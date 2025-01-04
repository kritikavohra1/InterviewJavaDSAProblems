package strings;

public class ReplaceCharInAString {

    public static void replaceChar(String str, int index, char ch){

        char[] newArr = str.toCharArray();

        for (int i = 0; i<newArr.length; i++){
            if (i==index){
                newArr[i] = ch;
            }
        }

        for (int i = 0; i< newArr.length; i++){
            System.out.print(newArr[i]);
        }
    }

    public static void main(String[] args) {

        String str = "Geeks Gor Geeks";

        int index = 6;
        char ch = 'F';
        //replaceChar(str, index, ch);
        str = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.setCharAt(index, ch);
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.setCharAt(index, ch);
        System.out.println(stringBuffer);
    }
}
