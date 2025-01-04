package strings;

public class CheckIfStringIsPalindrome {

    public static void checkPalindrome(String str){

        String revString = new String();

        for (int i = str.length()-1; i>=0; i--){
            revString += str.charAt(i);
        }
        System.out.println("Original String is: "+str);
        System.out.println("Reverse String is : "+revString);

        if (revString.equals(str)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not a palindrome");
        }
    }

    public static void main(String[] args) {

        String input = "abba";
        checkPalindrome(input);
    }
}
