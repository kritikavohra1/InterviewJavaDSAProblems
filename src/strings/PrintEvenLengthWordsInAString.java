package strings;

public class PrintEvenLengthWordsInAString {

    public static void main(String[] args) {

        String str = "i am Geeks for Geeks and a Geek";

        String[] str2 = str.split(" ");

        for (int i = 0; i<str2.length; i++){

            if (str2[i].length() %2 == 0){
                System.out.println(str2[i]);
            }
        }
    }
}
