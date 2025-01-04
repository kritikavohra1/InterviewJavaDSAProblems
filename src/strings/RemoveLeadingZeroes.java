package strings;

public class RemoveLeadingZeroes {


    public static void main(String[] args) {

        String str = "0000012356090";
        String newStr = "";

        for (int i = 0; i<str.length(); i++){

            if (str.charAt(i) == '0'){
                continue;
            }else {
                newStr = str.substring(i);
                break;
            }
        }

        System.out.println(newStr);
    }
}
