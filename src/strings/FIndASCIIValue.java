package strings;

public class FIndASCIIValue {

    public static void main(String[] args) {

        String str = "GEEKS";

        for (int i = 0; i< str.length(); i++){

            System.out.println(str.codePointAt(i));
        }
    }
}
